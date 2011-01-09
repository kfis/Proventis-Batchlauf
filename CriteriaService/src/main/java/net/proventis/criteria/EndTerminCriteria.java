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
public class EndTerminCriteria extends Criteria{

    public EndTerminCriteria(int days, int percentage) {
        super(days,percentage);
    }



    @Override
    public boolean checkTask(TaskInformation task) {
        return isInAbsoluteDaysBufferRange(task) || isInPercentDaysBufferRange(task) ;
    }

    @Override
    public CriteriaType getCriteriaType() {
       return CriteriaType.endTermin;
    }


    private boolean isInAbsoluteDaysBufferRange(TaskInformation task){
       Date bufferEndTermin =  new Date(task.getEndTermin().getTime() + getDays() * DAY_IN_MS);
      
        if(bufferEndTermin.after(new Date())){
            return true;
        }else{
            return taskHasFinished(task);
        }
    }

    private boolean isInPercentDaysBufferRange(TaskInformation task){
        long taskDuration = task.getEndTermin().getTime() -  task.getStartTermin().getTime();

        long bufferDays = (long)(taskDuration  / (1 / (double)getPercentage()) /100);

        Date bufferEndTermin  =  new Date(task.getEndTermin().getTime() + bufferDays);

        if(bufferEndTermin.after(new Date())){
            return true;
        }else{
            return taskHasFinished(task);
        }
    }

    private boolean taskHasFinished(TaskInformation task){
        return task.getProgress()>=100;
    }
}
