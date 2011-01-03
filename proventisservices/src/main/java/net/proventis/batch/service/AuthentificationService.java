/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.batch.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import net.proventis.service.BaseService;
import net.proventis.service.BaseServiceStub;
import net.proventis.service.InvalidUsernamePasswordCombinationException;
import org.apache.axis2.AxisFault;

/**
 *
 * @author gd
 */
@LocalBean
@Stateless
public class AuthentificationService {

    private BaseService baseService;

    @PostConstruct
    private void setUp(){
        try {
            baseService = new BaseServiceStub();
        } catch (AxisFault ex) {
            Logger.getLogger(AuthentificationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isAuthenticatedUser(String name, String password){
        try {
            baseService.login(RequestParameterFactory.createLoginParameter(name, password));
        } catch (InvalidUsernamePasswordCombinationException ex) {
             Logger.getLogger(AuthentificationService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(AuthentificationService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

}
