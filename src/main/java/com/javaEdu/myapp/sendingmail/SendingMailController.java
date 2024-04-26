package com.javaEdu.myapp.sendingmail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.javaEdu.myapp.utils.MailUtil;

@Controller("/mail")
public class SendingMailController {
	
	@GetMapping("/send")
	public boolean sendMail() {

		List<String> recipientList = new ArrayList<>();
		// from DB
		recipientList.add("hee_place@naver.com");
		recipientList.add("wjtmxm7@gmail.com");

		Map<String, String> mailContent = new HashMap<>();
		// value 수정
		mailContent.put("mailTitle", "[Test]");
		mailContent.put("mailHtml", "This is test mail");

		//sender
		
		// smtp 서버 정보, 메일 내용, 받는 사람리스트
		
		
		MailUtil mailUtil = new MailUtil();
		//받는사람, 메일내용을 넘김
		mailUtil.sendMail(recipientList, mailContent);
		return true; //임시

	}

}
