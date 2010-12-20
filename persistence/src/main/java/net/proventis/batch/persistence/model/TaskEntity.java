/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.batch.persistence.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gd
 */
@Entity
@NamedQueries(
    @NamedQuery(
        name = "TaskEntity.findTaskEntityById",
        query="SELECT t FROM TaskEntity t WHERE t.taskId = :taskId"
    )
)
 @Table(name="TaskEntity")
public class TaskEntity {

    @Id
    private long taskId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSended;

    public Date getLastSended() {
        return lastSended;
    }

    public void setLastSended(Date lastSended) {
        this.lastSended = lastSended;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    


}
