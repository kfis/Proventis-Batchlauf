/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.batch.persistence.service;

import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.proventis.batch.persistence.model.TaskEntity;

/**
 *
 * @author gd
 */
@Stateless
public class BatchPersisterService implements BatchPersisterLocal{

    @PersistenceContext(unitName="batchpersister")
    protected EntityManager em;


    @Override
    public void save(TaskEntity project) {
       
        em.persist(project);
    }

    @Override
    public void delete(TaskEntity project) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<TaskEntity> findTasksSendedAfter(Date time) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteTasksSendedBefore(Date time) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
