/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.proventis.batch.service;

import net.proventis.axis.blueant.base.Id;
import net.proventis.axis.blueant.base.LoginRequestParameter;
import net.proventis.axis.blueant.base.LogoutRequestParameter;
import net.proventis.axis.blueant.cost.GetTasksRequestParameter;
import net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter;
import net.proventis.axis.blueant.project.GetProjectTasksRequestParameter;

/**
 *
 * @author gd
 */
public class RequestParameterFactory {

    public static LoginRequestParameter createLoginParameter(String username, String password) {
        LoginRequestParameter lrp = new LoginRequestParameter();
        lrp.setPassword(password);
        lrp.setUsername(username);
        return lrp;
    }

    public static LogoutRequestParameter createLogoutParameter(String sessionId) {
        LogoutRequestParameter lrp = new LogoutRequestParameter();
        lrp.setSessionID(sessionId);
        return lrp;
    }

    public static GetProjectTasksRequestParameter createTaskParameter(String sessionId, Id projectId) {
        GetProjectTasksRequestParameter gpr = new GetProjectTasksRequestParameter();
        gpr.setSessionID(sessionId);

        gpr.setProjectID(projectId);
        return gpr;
    }

    public static GetParticipationProjectsRequestParameter createProjectParameter(String sessionId) {
        GetParticipationProjectsRequestParameter gp = new GetParticipationProjectsRequestParameter();
        gp.setSessionID(sessionId);
        return gp;
    }

    public static GetTasksRequestParameter createGetTasksRequestParameter(String sessionId, Id taskId, Id projectId){
        GetTasksRequestParameter grp = new GetTasksRequestParameter();
        grp.setSelectedTaskID(taskId);
        grp.setSessionID(sessionId);
        grp.setProjectID(projectId);
        return grp;
    }
}
