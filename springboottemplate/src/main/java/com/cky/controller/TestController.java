package com.cky.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cc")
public class TestController {
	
	@RequestMapping("/cc")
	public String hi(Map<String, Object> model) {
		model.put("time", "2201");
		model.put("message", "这是测试的内容。。。");
		model.put("toUserName", "张三");
		model.put("fromUserName", "老许");
		return "test"; // 自动寻找resources/templates中名字为welcome.ftl/welcome.vm的文件作为模板，拼装后返回
	}
	
	@RequestMapping("/test")
	public ModelAndView test() {
		ModelAndView view = new ModelAndView("test");
		view.addObject("tim222e", "2201");
		view.addObject("message", "这是测试的内容22。。。");
		view.addObject("toUserName", "张三222");
		view.addObject("fromUserName", "老许222");
		return view;
	}
}
