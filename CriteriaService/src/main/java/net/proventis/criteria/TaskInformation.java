/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.criteria;

import java.util.Date;

/**
 *
 * @author gd
 */
public class TaskInformation {

    private String task;
    private long id;
    private double progress;
    private double plan;
    private boolean isCritical;


    private Date startTermin;
    private Date endTermin;

    public TaskInformation() {

    }

    public Date getEndTermin() {
        return endTermin;
    }

    public void setEndTermin(Date endTermin) {
        this.endTermin = endTermin;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public Date getStartTermin() {
        return startTermin;
    }

    public void setStartTermin(Date startTermin) {
        this.startTermin = startTermin;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

       public double getPlan() {
        return plan;
    }

    public void setPlan(double plan) {
        this.plan = plan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean IsCritical() {
        return isCritical;
    }

    public void setIsCritical(boolean isCritical) {
        this.isCritical = isCritical;
    }



    

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Task[Task: ").append(task).
                append(" progress: ").append(progress).
                append(" plan: ").append(plan).
                append(" starttime: ").append(startTermin.toLocaleString()).
                append(" endtime: ").append(endTermin.toLocaleString()).
                append("]");
        return info.toString();
    }







}
