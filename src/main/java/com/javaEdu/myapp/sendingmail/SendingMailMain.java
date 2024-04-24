package com.javaEdu.myapp.sendingmail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendingMailMain {

	public static void main(String[] args) {

//		String to = "hee_place@naver.com";
//		String from = "wjtmxm7@gmail.com";
//
//		//이메일 제목
//		String subject = "email test";
//		//이메일 내용
//		String body = "This is sent from java application";
//		
//		Properties prop = new Properties();
//		prop.put("mail.smtp.starttls.enable", "true");
//		prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//		
//		
//		Session session = Session.getDefaultInstance(prop, null);
//		
//		/*
//		 * MimeMessage: Text뿐만 아니라 html, 첨부파일 등 다양한 형식으로 구성하능하게 함
//		 * 이메일 메세지 작성, 수신된 메세지 읽기, 이메일 전송, MIME 형식 다루기 가능
//		 * 아래 코드는 메세지 사용법 
//		 */
//		MimeMessage message = new MimeMessage(session);
//		try {
//			//발신자 설정
//			message.setFrom(new InternetAddress(from));
//			
//			//수신자 설정
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			
//			//이메일 제목설정
//			message.setSubject(subject);
//			
//			//이메일 내용 설정
//			message.setText(body);
//			
//			//이메일 전송
//			Transport.send(message);
//			
//		} catch(Exception e) {
//			e.getStackTrace();
//		}
//		
//		System.out.println("이메일 전송");
		final String username = "smtp-client";
        final String password = "sqkqpsxgkycugxey";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("hee_place@naver.com"));
            message.setSubject("Testing JavaMail with Content Type");

            // 텍스트 형식의 이메일 본문 설정
            String emailContent = "Hello, this is a test email with plain text content.";
            message.setContent(emailContent, "text/plain");

            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            System.out.println("Sendin!");
            throw new RuntimeException(e);
        }
    }
		

}
