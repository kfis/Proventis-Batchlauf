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
public class StartTerminCriteria extends Criteria {

    public StartTerminCriteria(int days, int percentage) {
        super(days,percentage);
    }

    @Override
    public boolean checkTask(TaskInformation task) {
        return true;
    }

    @Override
    public CriteriaType getCriteriaType() {
        return CriteriaType.startTermin;
    }


}
