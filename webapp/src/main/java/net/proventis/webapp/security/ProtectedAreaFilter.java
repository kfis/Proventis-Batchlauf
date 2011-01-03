/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.webapp.security;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import net.proventis.webapp.user.SessionOwner;
import net.proventis.webapp.user.User;

/**
 *
 * @author gd
 */
public class ProtectedAreaFilter implements Filter{

    @Inject@SessionOwner
    private User user;

    @Override
    public void init(FilterConfig fc) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        if(user.isAuthenticated()){
            fc.doFilter(sr, sr1);
        }
        else{
           ((HttpServletResponse)sr1).sendRedirect("/webapp/login.xhtml");
        }
    }

    @Override
    public void destroy() {

    }

}
