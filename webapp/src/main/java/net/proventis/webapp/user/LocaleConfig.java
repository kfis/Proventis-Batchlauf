/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.webapp.user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author gd
 */
@Named
public class LocaleConfig{

    private String selectedLocale;

    public void changeLocale(){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(selectedLocale));
    }

    public String getSelectedLocale() {
        return selectedLocale;
    }

    public void setSelectedLocale(String selectedLocale) {
        this.selectedLocale = selectedLocale;
    }

    @Produces @Named("supportedLanguages")
    public List<String> getSupportedLanguages(){
        List<String> supportedLanguages = new ArrayList<String>();
        Iterator<Locale> l = FacesContext.getCurrentInstance().getApplication().getSupportedLocales();
        while(l.hasNext()){
            supportedLanguages.add(l.next().toString());
        }
        return supportedLanguages;
     }

}
