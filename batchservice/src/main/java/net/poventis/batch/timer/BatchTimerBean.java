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
import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import net.poventis.batch.model.BatchIntervalInfo;
import net.proventis.batch.mail.MailService;
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
    @EJB
    MailService mailService;
    
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
                markCritialTasks(projectInformation, bi);
                if(!bi.isReportFull()){
                    filterOutSendedWarnings(projectInformation, bi);
                    filterOutNotCriticalTasks(projectInformation, bi);
                }
                if(projectInformation.getTasks().size()>0){
                    send(projectInformation);
                    markTasksAsSended(projectInformation);
                }

            }


        } catch (Exception ex) {
            Logger.getLogger(BatchTimerBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Asynchronous
    public void checkImmediately(BatchIntervalInfo info){

        try {
            List<ProjectInformation> pi = projectInformationService.getProjectInformation(info.getUsername(), info.getPassword());
            for (ProjectInformation projectInformation : pi) {
                markCritialTasks(projectInformation, info);
                if(!info.isReportFull()){
                    filterOutNotCriticalTasks(projectInformation, info);
                }
                 if(projectInformation.getTasks().size()>0){
                    send(projectInformation);
                }
 
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
           if(!tasks.get(i).IsCritical()){
               tasks.remove(i);
           }
       }
    }

    private void send(ProjectInformation pi) {
        mailService.sendReport(pi);
    }

    private void markTasksAsSended(ProjectInformation pi) {
        List<TaskInformation> tasks = pi.getTasks();
        for (TaskInformation taskInformation : tasks) {
            batchPersisterService.markAsSended(taskInformation.getId(), new Date());
        }

    }

    private void markCritialTasks(ProjectInformation projectInformation, BatchIntervalInfo bi) {
         List<TaskInformation> tasks = projectInformation.getTasks();

        for(int i = tasks.size()-1; i>=0 ; i--){
            List<Criteria> criterias = bi.getCriterias();
            boolean critic = false;
            for (Criteria criteria : criterias) {
                critic = critic || !(criteria.checkTask(tasks.get(i)));
                tasks.get(i).setIsCritical(critic);
                System.out.println("TASKKFILTER "+criteria.getCriteriaType()+" :"+tasks.get(i) + "is "+criteria.checkTask(tasks.get(i)));
               }
            System.out.println("Task "+tasks.get(i)+" is critic "+tasks.get(i).IsCritical());
           }
    }




}
