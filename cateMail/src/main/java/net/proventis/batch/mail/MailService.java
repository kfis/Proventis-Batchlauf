package net.proventis.batch.mail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;

import com.sun.mail.smtp.SMTPSSLTransport;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import net.proventis.criteria.ProjectInformation;
import net.proventis.criteria.TaskInformation;

@LocalBean
@Stateless
public class MailService {

    public void sendReport(ProjectInformation projectInformation) {
        projectInformation.setEmailAddressProjectLeader("Konrad.Fischer@Gameduell.de");
        try {
            postMail(projectInformation);
        } catch (MessagingException ex) {
            Logger.getLogger(MailService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MailService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void postMail(ProjectInformation report) throws MessagingException, IOException {


        Authenticator auth = new SMTPAuthenticator();

        Session session = Session.getDefaultInstance(getProperties(), auth);
        session.setDebug(true);
        Message msg = new MimeMessage(session);
        InternetAddress addressFrom = new InternetAddress("reportService@blueAnt.de");
        msg.setFrom(addressFrom);
        InternetAddress addressTo = new InternetAddress(report.getEmailAddressProjectLeader());
        msg.setRecipient(Message.RecipientType.TO, addressTo);
        msg.setSubject(createSubject(report));
//		msg.setContent(message, "text/plain");


        msg.setContent(getHTMLContent(report), "text/html");



        System.out.println("contentType:" + msg.getContentType());
        msg.getContent();

//		message = getMessage();
        System.out.println("Now Sending...");
        SMTPSSLTransport.send(msg);
        System.out.println("Message sent");
    }

    private String getHTMLContent(ProjectInformation pi) {
        String content = "";
        content = "<h1>Bericht vom " + getReportDate() + "</h1>";
        content = content + "<h2>Projektname: " + pi.getProject() + "</h2>";
        content = content + "<h2>Projektleiter: " + pi.getProjectLeaderName() + "</h2>";

        for (TaskInformation t : pi.getTasks()) {
            content = content + "<h3>Aktivitaet: " + t.getTask() + "</h3>";
            content = content + "<table>";
            content = content + "<tr><td>Start-Termin: </td><td>" + t.getStartTermin().toString() + "</td></tr>";
            content = content + "<tr><td>End-Termin: </td><td>" + t.getEndTermin().toString() + "</td></tr>";
            content = content + "<tr><td>Ist-Zustand: </td><td>" + t.getProgress() + "</td></tr>";
            content = content + "</table>";
        }


        return content;
    }

    private String getReportDate() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_MONTH) + "." + cal.get(Calendar.MONTH + 1) + "." + cal.get(Calendar.YEAR);
    }

    private String getMessage() throws FileNotFoundException {
        File file = new File("bericht.html");
        FileReader reader = new FileReader(file);
        String message = "";

        try {
            BufferedReader in = new BufferedReader(reader);
            String line = null;
            while ((line = in.readLine()) != null) {
                message = message + line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }

    private Properties getProperties() throws IOException {
        Properties p = new Properties();
        p.load(this.getClass().getResourceAsStream("/mailConfig.properties"));
        return p;
    }

    private Properties readPropsFromFile() throws Exception {
        File file = new File("mailConfig.txt");
        FileReader reader = new FileReader(file);
        Properties props = new Properties();

        try {
            BufferedReader in = new BufferedReader(reader);
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println("Read: " + line);
                if (!line.equals("")) // && !line.startsWith("username") && !line.startsWith("password"))
                {
                    //Line is split where the colon is
                    props.setProperty("mail.smtp." + line.substring(0, line.indexOf(':')), line.substring(line.indexOf(':') + 2, line.length()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }

    private String createSubject(ProjectInformation pi) {

        String reportDate = getReportDate();
        return "Report for Project" + pi.getProject() + " - " + reportDate;

    }

    public static void main(String[] args) throws Exception {
        Report report = new Report();
        //postMail(readPropsFromFile(), report);

    }

    private static class SMTPAuthenticator extends javax.mail.Authenticator {

        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            String username = "s0516540";
            String password = "dkDsytVW";
            return new PasswordAuthentication(username, password);
        }
    }
}
