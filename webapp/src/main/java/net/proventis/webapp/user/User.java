/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.webapp.user;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author gd
 */
@SessionScoped @SessionOwner @Named("SessionOwner")
public class User implements Serializable {

    private String name;
    private String password;
    private boolean isAuthenticated;

    public boolean isAuthenticated() {
        return isAuthenticated;
    }
    public void setIsAuthenticated(boolean isAuthenticated){
        this.isAuthenticated=isAuthenticated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
