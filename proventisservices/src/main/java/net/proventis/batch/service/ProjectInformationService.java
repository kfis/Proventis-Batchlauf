/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.proventis.batch.service;

import net.proventis.criteria.ProjectInformation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import net.proventis.axis.blueant.base.Id;
import net.proventis.axis.blueant.cost.T_WorkTimeTask;
import net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter;
import net.proventis.axis.blueant.masterdata.T_Progress;
import net.proventis.axis.blueant.project.ParticipationProjectList;
import net.proventis.axis.blueant.project.T_ParticipationProject;
import net.proventis.axis.blueant.project.T_ProjectTask;
import net.proventis.axis.blueant.project.T_TaskResource;
import net.proventis.criteria.TaskInformation;
import net.proventis.service.BaseService;
import net.proventis.service.BaseServiceStub;
import net.proventis.service.MasterDataService;
import net.proventis.service.MasterDataServiceStub;
import net.proventis.service.ProjectsService;
import net.proventis.service.ProjectsServiceStub;
import net.proventis.service.WorktimeAccountingService;
import net.proventis.service.WorktimeAccountingServiceStub;
import org.apache.axis2.AxisFault;

/**
 *
 * @author gd
 */
@LocalBean
@Stateless
public class ProjectInformationService {

    private BaseService baseService;
    private ProjectsService projectService;
    private MasterDataService masterDataService;
    private WorktimeAccountingService worktimeAccountingService;


    @PostConstruct
    protected void init() {
        try {
            baseService = new BaseServiceStub();
            projectService = new ProjectsServiceStub();
            masterDataService = new MasterDataServiceStub();
            worktimeAccountingService = new WorktimeAccountingServiceStub();
        } catch (AxisFault ex) {
            Logger.getLogger(ProjectInformationService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<ProjectInformation> getProjectInformation(String username, String password) throws Exception {
        
        List<ProjectInformation> projects = new ArrayList<ProjectInformation>();

        String sessionId = login(username, password);
        T_Progress[] prog = masterDataService.getProgressList(createProgressRequestParameter(sessionId)).getProgress();

        for (T_Progress p : prog) {
            System.out.println(p.getValue());
        }




        ParticipationProjectList projectList = projectService.getParticipationProjects(RequestParameterFactory.createProjectParameter(sessionId));
        T_ParticipationProject[] pjl = projectList.getParticipationProject();


        for (T_ParticipationProject project : pjl) {
            T_ProjectTask[] tasks = projectService.getProjectTasks(RequestParameterFactory.createTaskParameter(sessionId, project.getProjectID())).getProjectTaskList().getProjectTask();    
            projects.add(createProjectsInformations(project, tasks,sessionId));
            
        }



        logout(sessionId);
        return projects;
          

        // return createDummyList();

    }

    private String login(String username, String password) throws Exception {
        return baseService.login(RequestParameterFactory.createLoginParameter(username, password)).getSessionID();
    }

    private void logout(String sessionId) throws Exception {
        baseService.logout(RequestParameterFactory.createLogoutParameter(sessionId));
    }


    private ProjectInformation createProjectsInformations(T_ParticipationProject project, T_ProjectTask[] tasks,String sessionId)throws Exception {
        ProjectInformation pi = new ProjectInformation();
        pi.setProject(project.getName());
        if (tasks != null) {
            addTaskInformationToProjectInformations(tasks, pi,sessionId,project.getProjectID());
        }
        return pi;
    }

    private void addTaskInformationToProjectInformations(T_ProjectTask[] tasks, ProjectInformation pi,String sessionId, Id projectId) throws Exception {
        for (T_ProjectTask task : tasks) {
            T_WorkTimeTask workTimeTask = worktimeAccountingService.getTasks(RequestParameterFactory.createGetTasksRequestParameter(sessionId, task.getTaskID(),projectId)).getWorkTimeTaskList().getWorkTimeTask()[0];
         
            TaskInformation ti = new TaskInformation();
            ti.setTask(task.getName());
            ti.setPlan(task.getPlan());
            ti.setProgress(workTimeTask.getSubjectiveProgressAll());
            ti.setId(task.getTaskID().getId());

            T_TaskResource[] ressources = task.getResources().getTaskResource();




            ti.setEndTermin(task.getEndTime().getTime());
            ti.setStartTermin(task.getStartTime().getTime());
            System.out.println(ti);

            //task.
            if(ressources!=null){
            for (T_TaskResource r : ressources) {
               

            }}

            pi.addTask(ti);
            if (task.getChildren().getProjectTask() != null) {
                addTaskInformationToProjectInformations(task.getChildren().getProjectTask(), pi,sessionId,projectId);
            }
        }

    }
    

    public static void main(String[]args){
        ProjectInformationService ps = new ProjectInformationService();
        ps.init();
        try {
            List<ProjectInformation> infos = ps.getProjectInformation("Konrad Fischer", "s0518814");
            for (ProjectInformation projectInformation : infos) {
                System.out.println(projectInformation);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProjectInformationService.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    private GetProgressListRequestParameter createProgressRequestParameter(String sessionId) {
        GetProgressListRequestParameter p = new GetProgressListRequestParameter();
        p.setSessionID(sessionId);
        return p;
    }

    private static List<ProjectInformation> createDummyList(){
        List<ProjectInformation> p = new ArrayList<ProjectInformation>();
        ProjectInformation i = new ProjectInformation();
        TaskInformation ti = new TaskInformation();
        ti.setTask("GUTER TASK");
        ti.setStartTermin(new Date(110,10,26));
        ti.setEndTermin(new Date(110,10,30));
        ti.setProgress(70);
        ti.setId(1);
        i.addTask(ti);


        ti = new TaskInformation();
        ti.setTask("Anfangstermin TASK");
        ti.setStartTermin(new Date(110,10,26));
        ti.setEndTermin(new Date(110,10,30));
        ti.setProgress(0);
        ti.setId(2);
        i.addTask(ti);

        ti = new TaskInformation();
        ti.setTask("Endtermin TASK");
        ti.setStartTermin(new Date(110,10,26));
        ti.setEndTermin(new Date(110,10,27));
        ti.setProgress(10);
        ti.setId(3);
        i.addTask(ti);

        ti = new TaskInformation();
        ti.setTask("Progress TASK");
        ti.setStartTermin(new Date(110,10,26));
        ti.setEndTermin(new Date(110,10,28));
        ti.setProgress(1);
        ti.setId(4);
        i.addTask(ti);

        p.add(i);
        return p;





    }


}
