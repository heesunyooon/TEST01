package com.javaEdu.myapp.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	
	public final Logger logger = LogManager.getLogger(this.getClass());
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
