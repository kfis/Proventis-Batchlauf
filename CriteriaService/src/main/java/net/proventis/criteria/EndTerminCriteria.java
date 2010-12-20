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
           System.out.println(taskHasFinished(task));
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

    public static void main(String[]args){
        TaskInformation task = new TaskInformation();
        task.setStartTermin(new Date(110,10,24));
        task.setEndTermin(new Date(110,10,26));
        task.setProgress(99);

        Criteria c = new EndTerminCriteria(2, 100);
        System.out.println(c.checkTask(task));


    }

}
