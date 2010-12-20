/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.webapp.configuration;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import net.poventis.batch.model.BatchIntervalInfo;
import net.poventis.batch.timer.BatchTimerBean;

/**
 *
 * @author gd
 */
@Named
@RequestScoped
public class ConfigBean {

    @EJB
    BatchTimerBean batch;

    private BatchIntervalInfo bi;

    @PostConstruct
    private void setUp(){
        if(isBatchRunning()){
            bi = batch.getBatchConfig();
        }else{
            bi = new BatchIntervalInfo();
        }
    }
    public int getTimerCount(){
        return batch.getTimerCount();
    }

    
    public boolean isBatchRunning(){
        return batch.isBatchRunning();
    }
    
    public BatchIntervalInfo getBatchIntervalInfo(){
        return bi;
    }

    public void setCheckInterval(String pattern){
        String[] hhmm = pattern.split(":");
        bi.setCheckInterval(Integer.valueOf(hhmm[0]), Integer.valueOf(hhmm[1]));
    }
    public String getCheckInterval(){
        int hoursAndMinutes = bi.getCheckInterval();
        String hours = ""+hoursAndMinutes / 60;
        String minutes = ""+ (hoursAndMinutes- (hoursAndMinutes / 60) *60);
        return hours+":"+minutes;
    }



    public void startBatch(){
        bi.setPassword("s0518814");
        bi.setUsername("Konrad Fischer");
        batch.createTimer(bi);
    }

    public void stopBatch(){
        batch.stopBatch();
    }
    public void sendReport(){
        bi.setPassword("s0518814");
        bi.setUsername("Konrad Fischer");
        batch.checkImmediately(bi);
    }
}
