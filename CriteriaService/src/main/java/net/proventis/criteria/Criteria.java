/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.criteria;

import net.proventis.batch.service.TaskInformation;

/**
 *
 * @author gd
 */
public abstract class Criteria {

    private int days;
    private int percentage;
    

    public Criteria(int days, int percentage) {
        this.days = days;
        this.percentage = percentage;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public abstract boolean checkTask(TaskInformation task);

    public abstract CriteriaType getCriteriaType();



}
