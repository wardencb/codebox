package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/test")
	public String test() {
		logger.trace("login日志输出 trace");
        logger.debug("login日志输出 debug");
        logger.info("login日志输出 info");
        logger.warn("login日志输出 warn");
        logger.error("login日志输出 error");
		return "登录";
	}

}
