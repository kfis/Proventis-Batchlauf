package net.proventis.webapp;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.proventis.batch.persistence.model.TaskEntity;
import net.proventis.batch.persistence.service.BatchPersisterLocal;
import net.proventis.batch.service.ProjectInformation;
import net.proventis.batch.service.ProjectInformationService;



public class TestServlet extends HttpServlet {

    @EJB
    BatchPersisterLocal bps;
    @EJB
    ProjectInformationService pis;


    @Override
    protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        test(arg0, arg1);
    }

    private void test(HttpServletRequest arg0, HttpServletResponse arg1) {
        try {
            List<ProjectInformation> pi = pis.getProjectInformation("Konrad Fischer", "s0518814");
            for (ProjectInformation projectInformation : pi) {
                System.out.println(projectInformation.toString());
            }
        } catch (Exception ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {

        ;
        test(arg0, arg1);
    }



    
}
