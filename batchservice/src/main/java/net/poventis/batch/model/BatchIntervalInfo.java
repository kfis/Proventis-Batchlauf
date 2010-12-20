/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.poventis.batch.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import net.proventis.criteria.Criteria;
import net.proventis.criteria.EndTerminCriteria;
import net.proventis.criteria.ProgressCriteria;
import net.proventis.criteria.StartTerminCriteria;

/**
 *
 * @author gd
 */
public class BatchIntervalInfo implements Serializable {
    /*
     * in Tagen
     */
    private int mailSendingInterval;
    /*
     * in minuten
     */
    private int checkInterval;

    private boolean reportForVice;

    private boolean reportFull;

    private EndTerminCriteria endTerminCriteria = new EndTerminCriteria(0, 0);
    private StartTerminCriteria startTerminCriteria = new StartTerminCriteria(0, 0);
    private ProgressCriteria progressCriteria = new ProgressCriteria(0, 0);

    private String username;



    private String password;

    public BatchIntervalInfo(){
       
    }

    public int getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(int hour, int minuten) {

        this.checkInterval = hour*60+minuten;
    }
    
    public int getMailSendingInterval() {
        return mailSendingInterval;
    }

    public void setMailSendingInterval(int mailSendingInterval) {
        this.mailSendingInterval = mailSendingInterval;
    }

    public List<Criteria> getCriterias() {
        ArrayList criterias = new ArrayList<Criteria>();
        criterias.add(startTerminCriteria);
        criterias.add(endTerminCriteria);
        criterias.add(progressCriteria);

        return criterias;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public EndTerminCriteria getEndTerminCriteria() {
        return endTerminCriteria;
    }

    public void setEndTerminCriteria(EndTerminCriteria endTerminCriteria) {
        this.endTerminCriteria = endTerminCriteria;
    }

    public ProgressCriteria getProgressCriteria() {
        return progressCriteria;
    }

    public void setProgressCriteria(ProgressCriteria progressCriteria) {
        this.progressCriteria = progressCriteria;
    }

    public StartTerminCriteria getStartTerminCriteria() {
        return startTerminCriteria;
    }

    public void setStartTerminCriteria(StartTerminCriteria startTerminCriteria) {
        this.startTerminCriteria = startTerminCriteria;
    }

    public boolean isReportForVice() {
        return reportForVice;
    }

    public void setReportForVice(boolean reportForVice) {
        this.reportForVice = reportForVice;
    }

    public boolean isReportFull() {
        return reportFull;
    }

    public void setReportFull(boolean reportFull) {
        this.reportFull = reportFull;
    }

    





}
