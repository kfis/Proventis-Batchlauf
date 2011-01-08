/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.webapp.security;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.inject.Named;
import net.proventis.batch.service.AuthentificationService;
import net.proventis.webapp.user.SessionOwner;
import net.proventis.webapp.user.User;

/**
 *
 * @author gd
 */
@Named
public class LoginBean {
    @EJB
    private AuthentificationService service;
    @Inject @SessionOwner
    private User user;

    public String login(){
      if(service.isAuthenticatedUser(user.getName(), user.getPassword())){
          user.setIsAuthenticated(true);
          return "config/mask.xhtml";
      }
      return "login.xhtml";
      
    }

    public String logOut(){
        user.setIsAuthenticated(false);
        return "";
    }
}
