import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

		Multipart mp = new MimeMultipart();
		MimeBodyPart htmlPart = new MimeBodyPart();
		htmlPart.setContent("<html><body><h1>Hallo Welt</h1></body></html>", "text/html");
		mp.addBodyPart(htmlPart);
		
		MimeBodyPart textPart = new MimeBodyPart();
		htmlPart.setContent("bla Dies ist der Textpart!!!!", "text/plain");
		mp.addBodyPart(textPart);
		
		
		msg.setContent(mp);
		msg.saveChanges();
		System.out.println("contentType:" + msg.getContentType());
		msg.getContent();