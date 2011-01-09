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

@LocalBean
@Stateless
public class MailService {

    private Properties props;
    private Authenticator auth;

    @PostConstruct
    private void setUp() throws IOException{
        props = getProperties();
        auth = new SMTPAuthenticator(props.getProperty("mail.smtp.username"), props.getProperty("mail.smtp.password"));
    }

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

    
    private String getReportDate() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_MONTH) + "." + cal.get(Calendar.MONTH + 1) + "." + cal.get(Calendar.YEAR);
    }
    private Properties getProperties() throws IOException {
        Properties p = new Properties();
        p.load(this.getClass().getResourceAsStream("/mailConfig.properties"));
        return p;
    }


    private boolean isInProduction(){
        return Boolean.valueOf(props.getProperty("mailservice.production"));
    }
    private String getDevEmail(){
        return props.getProperty("mailservice.dev.email");
    }

    private String createSubject(ProjectInformation pi) {
        String reportDate = getReportDate();
        return "Report for Project" + pi.getProject() + " - " + reportDate;

    }


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
