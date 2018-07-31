package com.cky.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cky.entity.ProUser;
import com.cky.service.ProUserService;

@RestController
@RequestMapping("/user")
public class ProUserController {
	
	@Autowired
    private ProUserService<ProUser> service;

	@RequestMapping("/list")
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.setViewName("userList");
		
		List<ProUser> userList = new ArrayList<ProUser>();
		
		userList = service.getListAll(new ProUser());
		modelAndView.addObject("fromUserName", "aaaaaaaaaaaaaaaaaaaaaaa");
		modelAndView.addObject("userList", userList);
		return modelAndView;
	}

}
