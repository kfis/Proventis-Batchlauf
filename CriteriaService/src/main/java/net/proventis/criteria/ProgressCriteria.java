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
public class ProgressCriteria extends Criteria{

    public ProgressCriteria(int days, int percentage) {
        super(days,percentage);
    }





    private long getExpectedProportionalStatusInPercent(TaskInformation task){
        long taskDuration = task.getEndTermin().getTime() - task.getStartTermin().getTime();
        long remainingDuration = task.getEndTermin().getTime() - System.currentTimeMillis();
        if(task.getStartTermin().after(new Date(System.currentTimeMillis()))){
            return 0;
        }
        if(remainingDuration<=0){
            return 100;
        }

        return (taskDuration-remainingDuration)*100/taskDuration;
    }


    private long getExpectedProportionalStatusInPercentWithBufferDays(TaskInformation task){
        long taskDuration = task.getEndTermin().getTime()+(getDays()*DAY_IN_MS) - task.getStartTermin().getTime();
        long remainingDuration = task.getEndTermin().getTime()+(getDays()*DAY_IN_MS) - System.currentTimeMillis();
        if(task.getStartTermin().after(new Date(System.currentTimeMillis()))){
            return 0;
        }
        if(remainingDuration<=0){
            return 100;
        }

        return (taskDuration-remainingDuration)*100/taskDuration;
    }

    @Override
    public boolean checkTask(TaskInformation task) {
        System.out.println(getExpectedProportionalStatusInPercentWithBufferDays(task));
       return (task.getProgress()>= getExpectedProportionalStatusInPercentWithBufferDays(task)
               || task.getProgress()+getPercentage() >= getExpectedProportionalStatusInPercent(task));
    }

    @Override
    public CriteriaType getCriteriaType() {
        return CriteriaType.progress;
    }

     public static void main(String[]args){
        TaskInformation task = new TaskInformation();
        task.setStartTermin(new Date(110,10,28));
        task.setEndTermin(new Date(110,10,29));
        task.setProgress(50);

        Criteria c = new ProgressCriteria(0, 8);
        System.out.println(c.checkTask(task));


    }

}
