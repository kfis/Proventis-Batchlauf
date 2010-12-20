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
public class StartTerminCriteria extends Criteria {

    public StartTerminCriteria(int days, int percentage) {
        super(days,percentage);
    }

    @Override
    public boolean checkTask(TaskInformation task) {
       return (isInAbsoluteDaysBufferRange(task)||isInPercentDaysBufferRange(task));
    }

    @Override
    public CriteriaType getCriteriaType() {
        return CriteriaType.startTermin;
    }


    private boolean isInAbsoluteDaysBufferRange(TaskInformation task){
       Date bufferStartTermin =  new Date(task.getStartTermin().getTime() + getDays() * DAY_IN_MS);
        if(bufferStartTermin.after(new Date())){
            return true;
        }else{
            return taskHasStarted(task);
        }
    }

    private boolean isInPercentDaysBufferRange(TaskInformation task){
        long taskDuration = task.getEndTermin().getTime() -  task.getStartTermin().getTime();

        long bufferDays = (long)(taskDuration  / (1 / (double)getPercentage()) /100);
    
        Date bufferStartTermin  =  new Date(task.getStartTermin().getTime() + bufferDays);
        if(bufferStartTermin.after(new Date())){
            return true;
        }else{
            return taskHasStarted(task);
        }
    }

    private boolean taskHasStarted(TaskInformation task){
        return task.getProgress()>0;
    }


   


}
