/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.poventis.batch.model;

import java.io.Serializable;

/**
 *
 * @author gd
 */
public class BatchIntervalInfo implements Serializable {
    private int mailSendingInterval;
    private int checkInterval;

    public BatchIntervalInfo(){
        
    }

    public int getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(int checkInterval) {
        this.checkInterval = checkInterval;
    }

    public int getMailSendingInterval() {
        return mailSendingInterval;
    }

    public void setMailSendingInterval(int mailSendingInterval) {
        this.mailSendingInterval = mailSendingInterval;
    }



}
