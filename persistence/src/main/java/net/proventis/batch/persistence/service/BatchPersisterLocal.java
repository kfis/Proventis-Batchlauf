/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.batch.persistence.service;

import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import net.proventis.batch.persistence.model.TaskEntity;


/**
 *
 * @author gd
 */
@Local
public interface BatchPersisterLocal {

    public void save(TaskEntity project);
    public void delete(TaskEntity project);
    public List<TaskEntity> findTasksSendedAfter(Date time);
    public void deleteTasksSendedBefore(Date time);




}
