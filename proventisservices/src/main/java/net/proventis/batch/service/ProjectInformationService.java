/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.proventis.batch.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import net.proventis.axis.blueant.masterdata.ActivityList;
import net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter;
import net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter;
import net.proventis.axis.blueant.masterdata.T_Activity;
import net.proventis.axis.blueant.masterdata.T_Progress;
import net.proventis.axis.blueant.project.GetProjectTasksRequestParameter;
import net.proventis.axis.blueant.project.ParticipationProjectList;
import net.proventis.axis.blueant.project.T_ParticipationProject;
import net.proventis.axis.blueant.project.T_ProjectTask;
import net.proventis.service.BaseService;
import net.proventis.service.BaseServiceStub;
import net.proventis.service.MasterDataService;
import net.proventis.service.MasterDataServiceStub;
import net.proventis.service.ProjectsService;
import net.proventis.service.ProjectsServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.log4j.chainsaw.Main;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

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

    @PostConstruct
    protected void init() {
        try {
            baseService = new BaseServiceStub();
            projectService = new ProjectsServiceStub();
            masterDataService = new MasterDataServiceStub();
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


        /*
        ParticipationProjectList projectList = projectService.getParticipationProjects(RequestParameterFactory.createProjectParameter(sessionId));
        T_ParticipationProject[] pjl = projectList.getParticipationProject();
        for (T_ParticipationProject project : pjl) {
        T_ProjectTask[] tasks = projectService.getProjectTasks(RequestParameterFactory.createTaskParameter(sessionId, project.getProjectID())).getProjectTaskList().getProjectTask();
        projects.add(createProjectsInformations(project, tasks));
        }
         */
/*
        ParticipationProjectList projectList = projectService.getParticipationProjects(RequestParameterFactory.createProjectParameter(sessionId));
        T_ParticipationProject[] pjl = projectList.getParticipationProject();
        for (T_ParticipationProject project : pjl) {
            T_ProjectTask[] tasks = projectService.getProjectTasks(RequestParameterFactory.createTaskParameter(sessionId, project.getProjectID())).getProjectTaskList().getProjectTask();
            projects.add(createProjectsInformations(project, tasks));
        }
*/

        logout(sessionId);
        return projects;

    }

    private String login(String username, String password) throws Exception {
        return baseService.login(RequestParameterFactory.createLoginParameter(username, password)).getSessionID();
    }

    private void logout(String sessionId) throws Exception {
        baseService.logout(RequestParameterFactory.createLogoutParameter(sessionId));
    }

    public static void main(String[] args) {
        ProjectInformationService pis = new ProjectInformationService();
        pis.init();
        try {
            List<ProjectInformation> list = pis.getProjectInformation("Konrad Fischer", "s0518814");

            //



            for (ProjectInformation projectInformation : list) {
                System.out.println(projectInformation);
            }


        } catch (Exception ex) {
            Logger.getLogger(ProjectInformationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private ProjectInformation createProjectsInformations(T_ParticipationProject project, T_ProjectTask[] tasks) {
        ProjectInformation pi = new ProjectInformation();
        pi.setProject(project.getName());
        if (tasks != null) {
           addTaskInformationToProjectInformations(tasks, pi);
        }
        return pi;
    }

    private void addTaskInformationToProjectInformations(T_ProjectTask[] tasks, ProjectInformation pi){
        for (T_ProjectTask task : tasks) {

            
            TaskInformation ti = new TaskInformation();
            ti.setTask(task.getName());
            ti.setPlan(task.getPlan());
            ti.setProgress(task.getActual());
            ti.setEndTermin(task.getEndTime().getTime());
            ti.setStartTermin(task.getStartTime().getTime());
            pi.addTask(ti);
            if(task.getChildren().getProjectTask()!=null){
                addTaskInformationToProjectInformations(task.getChildren().getProjectTask(), pi);
            }
        }

    }

    private GetProgressListRequestParameter createProgressRequestParameter(String sessionId) {
       GetProgressListRequestParameter p = new GetProgressListRequestParameter();
       p.setSessionID(sessionId);
       return p;
    }

    
}
