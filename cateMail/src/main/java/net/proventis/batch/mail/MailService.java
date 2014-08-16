package net.proventis.batch.mail;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;

import com.sun.mail.smtp.SMTPSSLTransport;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import net.proventis.criteria.ProjectInformation;

/**
 * Class to send reports to project leaders.
 * @author richard
 *
 */
@LocalBean
@Stateless
public class MailService {

	/** Properties file */
    private Properties props;
    /** Authenticator for JavaMail SMTP */
    private Authenticator auth;

    /**
     * Initializes the mail service.
     * @throws IOException
     */
    @PostConstruct
    private void setUp() throws IOException{
        props = getProperties();
        auth = new SMTPAuthenticator(props.getProperty("mail.smtp.username"), props.getProperty("mail.smtp.password"));
    }

    /**
     * Sends the given project information to the project leader, if not in development mode.
     * @param projectInformation project information object
     */
    public void sendReport(ProjectInformation projectInformation) {
        if(!isInProduction()){
            projectInformation.setEmailAddressProjectLeader(getDevEmail());
        }
        try {
            postMail(projectInformation);
        } catch (MessagingException ex) {
            Logger.getLogger(MailService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MailService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Builds a HTML report from the project information object and sends it via mail.
     * @param report project information object
     * @throws MessagingException
     * @throws IOException
     */
    private void postMail(ProjectInformation report) throws MessagingException, IOException {
        Session session = Session.getDefaultInstance(props, auth);
        Message msg = new MimeMessage(session);
        InternetAddress addressFrom = new InternetAddress("reportService@blueAnt.de");
        msg.setFrom(addressFrom);
        InternetAddress addressTo = new InternetAddress(report.getEmailAddressProjectLeader());
        msg.setRecipient(Message.RecipientType.TO, addressTo);
        msg.setSubject(createSubject(report));
        msg.setContent(new ReportBuilder(report).buildReport(), "text/html");
        msg.getContent();
        SMTPSSLTransport.send(msg);
    }

    /**
     * Returns the current date as string.
     * @return String with the current date
     */
    private String getReportDate() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_MONTH) + "." + cal.get(Calendar.MONTH + 1) + "." + cal.get(Calendar.YEAR);
    }
    
    /**
     * Reads Properties from configuration file "mailConfig.properties"
     * @return properties object with all properties from the file
     * @throws IOException
     */
    private Properties getProperties() throws IOException {
        Properties p = new Properties();
        p.load(this.getClass().getResourceAsStream("/mailConfig.properties"));
        return p;
    }

    /**
     * Returns the state of mailservice.production
     * @return true if mailservice.production is set
     */
    private boolean isInProduction(){
        return Boolean.valueOf(props.getProperty("mailservice.production"));
    }
    
    /**
     * Returns the state of mailservice.dev.email
     * @return Development mail address
     */
    private String getDevEmail(){
        return props.getProperty("mailservice.dev.email");
    }

    /**
     * Returns the subject string for the given project.
     * @param pi - the project information object
     * @return the title string for a project report
     */
    private String createSubject(ProjectInformation pi) {
        String reportDate = getReportDate();
        return "Report for Project" + pi.getProject() + " - " + reportDate;

    }

    /**
     * Authenticator Class for SMTP
     */
    private static class SMTPAuthenticator extends javax.mail.Authenticator {
        private final String password;
        private final String username;

        public SMTPAuthenticator(String username, String password){
            this.username=username;
            this.password=password;
        }
        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
        }
    }
}
