package com.javaEdu.myapp.sendingmail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.javaEdu.myapp.utils.MailUtil;

public class SendingMailMain {

	public static void main(String[] args) {


		List<String> recipientList = new ArrayList<>();
		// from DB
		recipientList.add("hee_place@naver.com");
		recipientList.add("wjtmxm7@gmail.com");

		Map<String, String> mailContent = new HashMap<>();
		// value 수정
		mailContent.put("mailTitle", "This is test mail");
		mailContent.put("mailHtml", "This is test mail");

		//sender
		
		// smtp 서버 정보, 메일 내용, 받는 사람리스트
		
		
		MailUtil mailUtil = new MailUtil();
		//받는사람, 메일내용을 넘김
		mailUtil.sendMail(recipientList, mailContent);

	}

}
