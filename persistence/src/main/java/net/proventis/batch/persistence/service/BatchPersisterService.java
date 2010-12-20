/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.batch.persistence.service;

import java.util.Date;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import net.proventis.batch.persistence.model.TaskEntity;

/**
 *
 * @author gd
 */
@Stateless
@LocalBean
public class BatchPersisterService{

    @PersistenceContext(unitName="batchpersister")
    protected EntityManager em;


    public void markAsSended(long id, Date when) {
       TaskEntity t = new TaskEntity();
       t.setTaskId(id);
       t.setLastSended(when);
        try{
        em.merge(t);
        }
       catch(IllegalArgumentException e){
            em.persist(t);
       }      
    }
    public void delete(TaskEntity t) {
        em.remove(t);
    }

    public Date getLastSendedFor(long taskId){
        try{
            TaskEntity t = (TaskEntity) em.createNamedQuery("TaskEntity.findTaskEntityById").setParameter("taskId", taskId).getSingleResult();
            return t.getLastSended();
        } catch (NoResultException e) {
             return null;
         }
    }

 
   

}
