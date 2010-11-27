/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.batch.persistence.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gd
 */
@Entity
public class TaskEntity {

    @Id
    private String taskId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSended;

    public Date getLastSended() {
        return lastSended;
    }

    public void setLastSended(Date lastSended) {
        this.lastSended = lastSended;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    


}
