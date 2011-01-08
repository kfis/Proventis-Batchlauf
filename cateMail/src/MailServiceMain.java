import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import com.sun.mail.smtp.SMTPSSLTransport;

public class MailServiceMain
{

	public static void postMail(Properties props, Report report) throws MessagingException, IOException
	{
	    props.put("mail.transport.protocol", "smtp");
		
		props.setProperty("mail.smtp.submitter", "s0516540");
		props.setProperty("mail.smtp.ssl.enable", "true");		
		
        Authenticator auth = new SMTPAuthenticator();

		Session session = Session.getDefaultInstance(props,auth);
		session.setDebug(true);
		Message msg = new MimeMessage(session);		
		InternetAddress addressFrom = new InternetAddress("reportService@blueAnt.de");
		msg.setFrom(addressFrom);		
		InternetAddress addressTo = new InternetAddress(report.getRecipient());
		msg.setRecipient(Message.RecipientType.TO, addressTo);		
		msg.setSubject(report.getSubject());
//		msg.setContent(message, "text/plain");
		

		msg.setContent(getHTMLContent(report), "text/html");

		

		System.out.println("contentType:" + msg.getContentType());
		msg.getContent();
		
//		message = getMessage();
		System.out.println("Now Sending...");
		SMTPSSLTransport.send(msg);
		System.out.println("Message sent");
	}
	
	private static String getHTMLContent(Report r)
	{
		String content = "";
		content = "<h1>Bericht vom " + r.getReportDate() + "</h1>";
		content = content + "<h2>Projektname: " + r.getProjectName() + "</h2>";
		content = content + "<h2>Projektleiter: " + r.getProjectLeaderName() + "</h2>";
		
		for (Activity act : r.getActivities())
		{
			content = content + "<h3>Aktivitaet: " + act.getName() + "</h3>";
			content = content + "<table>";
			content = content + "<tr><td>Start-Termin: </td><td>" + act.getStartDate() + "</td></tr>";
			content = content + "<tr><td>End-Termin: </td><td>" + act.getEndDate() + "</td></tr>";	
			content = content + "<tr><td>Ist-Zustand: </td><td>" + act.getActualState() + "</td></tr>";			
			content = content + "</table>";
		}
		
		return content;
	}
	
	private static String getMessage() throws FileNotFoundException
	{
		File file = new File("bericht.html");
		FileReader reader = new FileReader(file);
		String message = "";
		
		try 
		{
			BufferedReader in = new BufferedReader(reader);
			String line = null;
			while ((line = in.readLine()) != null)
			{
				message = message + line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return message;
	}

	private static Properties readPropsFromFile() throws Exception
	{
		File file = new File("mailConfig.txt");
		FileReader reader = new FileReader(file);
		Properties props = new Properties();
		
		try 
		{
			BufferedReader in = new BufferedReader(reader);
			String line = null;
			while ((line = in.readLine()) != null) {
				System.out.println("Read: " + line);
				if (!line.equals("")) // && !line.startsWith("username") && !line.startsWith("password"))
				{
					//Line is split where the colon is
					props.setProperty("mail.smtp." + line.substring(0,line.indexOf(':')), line.substring(line.indexOf(':')+2, line.length()));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

	public static void main(String[] args) throws Exception
	{
		Report report = new Report();
		postMail(readPropsFromFile(), report);		
		
	}
	
    private static class SMTPAuthenticator extends javax.mail.Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
           String username = "s0516540";
           String password = "dkDsytVW";
           return new PasswordAuthentication(username, password);
        }
    }
}
