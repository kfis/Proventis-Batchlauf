package net.proventis.criteria;

import java.io.Serializable;

/**
 *
 * A Criteria is the abstract Parent class of all Criterias, to provide common functionality.
 *
 */
public abstract class Criteria implements Serializable{

    public static long DAY_IN_MS = 1000*60*60*24;

    private int days;
    private int percentage;
    

    /**
     *
     * @param days days, that the task can differ from the Criteria
     * @param percentage percentage, that the task can differ from the Criteria
     */
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

    /**
     * Checks, wether the task fits the Criteria with the given differences in percentage and days
     * @param task
     * @return true, if the task is critical
     */
    public abstract boolean checkTask(TaskInformation task);

    public abstract CriteriaType getCriteriaType();



}
