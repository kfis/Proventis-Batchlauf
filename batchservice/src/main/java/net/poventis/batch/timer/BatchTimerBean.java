/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.poventis.batch.timer;


import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import net.poventis.batch.model.BatchIntervalInfo;
import net.proventis.batch.persistence.service.BatchPersisterService;
import net.proventis.criteria.ProjectInformation;
import net.proventis.batch.service.ProjectInformationService;
import net.proventis.criteria.Criteria;
import net.proventis.criteria.TaskInformation;

/**
 *
 * @author gd
 */
@Stateless
@LocalBean
public class BatchTimerBean {
    @Resource
    TimerService timerservice;
    @EJB
    ProjectInformationService projectInformationService;
    @EJB
    BatchPersisterService batchPersisterService;
    
    public void createTimer(BatchIntervalInfo bi){
        stopBatch();
        timerservice.createTimer(0, bi.getCheckInterval()*60*1000, bi);
    }

    public boolean isBatchRunning(){
        return timerservice.getTimers().size()>0;
    }

    public void stopBatch(){
        Collection<Timer> timer = timerservice.getTimers();

        for (Timer timer1 : timer) {
            timer1.cancel();
        }
    }

    public int getTimerCount(){
        return timerservice.getTimers().size();
    }

    public BatchIntervalInfo getBatchConfig(){
        if(isBatchRunning()){
            return (BatchIntervalInfo) timerservice.getTimers().iterator().next().getInfo();
        }else{
            return new BatchIntervalInfo();
        }
    }


    @Timeout
    public void check(Timer timer){
        BatchIntervalInfo bi = (BatchIntervalInfo) timer.getInfo();
        try {
            List<ProjectInformation> pi = projectInformationService.getProjectInformation(bi.getUsername(), bi.getPassword());
            for (ProjectInformation projectInformation : pi) {
                filterOutSendedWarnings(projectInformation, bi);
                filterOutNotCriticalTasks(projectInformation, bi);
                send(projectInformation);
                markTasksAsSended(projectInformation);

            }


        } catch (Exception ex) {
            Logger.getLogger(BatchTimerBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void checkImmediately(BatchIntervalInfo info){

        try {
            List<ProjectInformation> pi = projectInformationService.getProjectInformation(info.getUsername(), info.getPassword());
            for (ProjectInformation projectInformation : pi) {
                filterOutNotCriticalTasks(projectInformation, info);
                send(projectInformation);
 
            }


        } catch (Exception ex) {
            Logger.getLogger(BatchTimerBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void filterOutSendedWarnings(ProjectInformation pi, BatchIntervalInfo bi) {
        List<TaskInformation> tasks = pi.getTasks();

        for(int i = tasks.size()-1; i>=0; i--){
            Date d = batchPersisterService.getLastSendedFor(tasks.get(i).getId());
            if(d!=null){
                if(new Date().getTime()-bi.getMailSendingInterval()*60*24*60*1000 - d.getTime() <=0){
                    System.out.println("MAILSENDEDFILTER TASK: "+tasks.get(i));
                    tasks.remove(i);
                }
            }
        }
        
    }

    private void filterOutNotCriticalTasks(ProjectInformation projectInformation, BatchIntervalInfo bi) {
        List<TaskInformation> tasks = projectInformation.getTasks();
       for(int i = tasks.size()-1; i>=0 ; i--){
            List<Criteria> criterias = bi.getCriterias();
            boolean critic = false;
            for (Criteria criteria : criterias) {
                critic = critic || !(criteria.checkTask(tasks.get(i)));
                System.out.println("TASKKFILTER "+criteria.getCriteriaType()+" :"+tasks.get(i) + "is "+criteria.checkTask(tasks.get(i)));
               }
            if(!critic){
                tasks.remove(i);
           }
       }
    }

    private void send(ProjectInformation pi) {
      System.out.println("SENDING:"+pi.toString());
    }

    private void markTasksAsSended(ProjectInformation pi) {
        List<TaskInformation> tasks = pi.getTasks();
        for (TaskInformation taskInformation : tasks) {
            batchPersisterService.markAsSended(taskInformation.getId(), new Date());
        }

    }




}
