/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.criteria;

import java.util.ArrayList;
import java.util.List;
import net.proventis.criteria.TaskInformation;

/**
 *
 * @author gd
 */
public class ProjectInformation {

    private String project;
    private List<TaskInformation> tasks;

    public ProjectInformation() {
        tasks = new ArrayList<TaskInformation>();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<TaskInformation> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskInformation> tasks) {
        this.tasks = tasks;
    }

    public void addTask(TaskInformation task){
        tasks.add(task);
    }

    @Override
    public String toString(){
        StringBuilder info = new StringBuilder();
        info.append("Project[project: ").append(project).append(" with Tasks:{\n");
        for (TaskInformation taskInformation : tasks) {
            info.append(taskInformation.toString()).append("\n");
        }
        info.append("}]");
        return info.toString();
    }




}
