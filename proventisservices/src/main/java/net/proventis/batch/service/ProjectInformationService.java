/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.proventis.batch.service;

import net.proventis.axis.blueant.human.T_Person;
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
import net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter;
import net.proventis.axis.blueant.project.ParticipationProjectList;
import net.proventis.axis.blueant.project.T_ParticipationProject;
import net.proventis.axis.blueant.project.T_Project;
import net.proventis.axis.blueant.project.T_ProjectTask;
import net.proventis.axis.blueant.project.T_TaskResource;
import net.proventis.criteria.TaskInformation;
import net.proventis.service.BaseService;
import net.proventis.service.BaseServiceStub;
import net.proventis.service.HumanService;
import net.proventis.service.HumanServiceStub;
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
    private HumanService humanService;


    @PostConstruct
    protected void init() {
        try {
            baseService = new BaseServiceStub();
            projectService = new ProjectsServiceStub();
            masterDataService = new MasterDataServiceStub();
            worktimeAccountingService = new WorktimeAccountingServiceStub();
            humanService = new HumanServiceStub();
        } catch (AxisFault ex) {
            Logger.getLogger(ProjectInformationService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<ProjectInformation> getProjectInformation(String username, String password) throws Exception {
        
        List<ProjectInformation> projects = new ArrayList<ProjectInformation>();

        String sessionId = login(username, password);
        

        ParticipationProjectList projectList = projectService.getParticipationProjects(RequestParameterFactory.createProjectParameter(sessionId));
        T_ParticipationProject[] pjl = projectList.getParticipationProject();


        for (T_ParticipationProject project : pjl) {
            T_ProjectTask[] tasks = projectService.getProjectTasks(RequestParameterFactory.createTaskParameter(sessionId, project.getProjectID())).getProjectTaskList().getProjectTask();    
            ProjectInformation pi = createProjectsInformations(project, tasks,sessionId);
            if(pi!=null){
                projects.add(pi);
            }
            
        }
        logout(sessionId);
        return projects;

    }

    private String login(String username, String password) throws Exception {
        return baseService.login(RequestParameterFactory.createLoginParameter(username, password)).getSessionID();
    }

    private void logout(String sessionId) throws Exception {
        baseService.logout(RequestParameterFactory.createLogoutParameter(sessionId));
    }


    private ProjectInformation createProjectsInformations(T_ParticipationProject project, T_ProjectTask[] tasks,String sessionId)throws Exception {
        ProjectInformation pi = new ProjectInformation();
        if(!setEmailInformationsForProject(pi, project, sessionId)){
             Logger.getLogger(ProjectInformationService.class.getName()).log(Level.WARNING,
                     "Couldnt set Email-Information for Project with ID "+project.getProjectID().getId() + " and thatswhy will not bet part of the Batch."
                     +"Project wasnt available through getProjectList(...)");
            return null;
        }
        pi.setProject(project.getName());
        if (tasks != null) {
            addTaskInformationToProjectInformations(tasks, pi,sessionId,project.getProjectID());
        }
        
        return pi;
    }

    private boolean setEmailInformationsForProject(ProjectInformation pi, T_ParticipationProject project, String sessionId)throws Exception{
        
        T_Project[] projectInfo =  projectService.getProjectList(RequestParameterFactory.createProjectListParameter(project.getName(), sessionId)).getProject();
        if(projectInfo == null){
            return false;
        }
        T_Person person = humanService.searchPersons(RequestParameterFactory.createSearchPersonParameter(projectInfo[0].getProjectLeaderID(), sessionId)).getPerson()[0];
        
         pi.setEmailAddressProjectLeader(person.getEmail());
         pi.setProjectLeaderName(person.getFirstname()+" "+person.getLastname());
       
        return true;
    }

    private void addTaskInformationToProjectInformations(T_ProjectTask[] tasks, ProjectInformation pi,String sessionId, Id projectId) throws Exception {
        for (T_ProjectTask task : tasks) {
                     
            TaskInformation ti = new TaskInformation();
            ti.setTask(task.getName());
            ti.setProgress(100); //TODO
            ti.setId(task.getTaskID().getId());

            ti.setEndTermin(task.getEndTime().getTime());
            ti.setStartTermin(task.getStartTime().getTime());

            pi.addTask(ti);
            if (task.getChildren().getProjectTask() != null) {
                addTaskInformationToProjectInformations(task.getChildren().getProjectTask(), pi,sessionId,projectId);
            }
        }

    }
}
