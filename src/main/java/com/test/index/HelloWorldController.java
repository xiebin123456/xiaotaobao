package com.test.index;
/**
 * 电商首页
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public String hello(){
		
		return "hello";
	}
	@RequestMapping("/login2")
	public String login(){
		
		return "login";
	}
}
