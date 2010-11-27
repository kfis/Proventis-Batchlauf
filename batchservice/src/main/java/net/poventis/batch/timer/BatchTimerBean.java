/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.poventis.batch.timer;

import java.util.Timer;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.TimerService;
import net.poventis.batch.model.BatchIntervalInfo;

/**
 *
 * @author gd
 */
@Stateless
@LocalBean
public class BatchTimerBean {
    @Resource
    TimerService timerservice;
    
    public void createTimer(BatchIntervalInfo bi){
        timerservice.createTimer(0, bi.getCheckInterval(), bi);
    }


    @Timeout
    public void check(Timer timer){

    }


}
