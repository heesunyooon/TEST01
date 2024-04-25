package com.javaEdu.myapp.sendingmail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendingMailMain {

	public static void main(String[] args) {
		try {
			// 구글 SMTP 사용하기 위한 정보 - 임시
			String googleUserName = "wjtmxm7@gmail.com";
			String googlePasswd = "mnftpkimimxvnvbf";

			// 받는사람정보
			String to = "hee_place@naver.com";

			// 보내는 사람 묶음
			InternetAddress[] addrArray = new InternetAddress[1];

			// 받는 사람 설정
			InternetAddress address = new InternetAddress();
			address.setAddress(to);
			address.setPersonal("TEST", "UTF-8");

			addrArray[0] = address;

			// 메일서버 설정
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			// 메일 내용 설정
			Session session = Session.getDefaultInstance(props, null);
			String emailContent = "Hello, this is a test email with plain text content.";
			Message message = new MimeMessage(session);
			message.setFrom(address);
			message.setSubject("Testing JavaMail with Content Type");
			message.setContent(emailContent, "text/html; charset=UTF-8");
			message.setRecipients(Message.RecipientType.TO, addrArray);

			Transport.send(message, googleUserName, googlePasswd);
			System.out.println("Email sent successfully!");

		} catch (Exception e) {
			System.out.println("Sendin!");
			throw new RuntimeException(e);
		}
	}

}
