package com.springmvcmaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		String message = "<br><div style='text-align:center;'>"+
						 "<h3>****** Hello World, Spring MVC Tutorial with maven this message is comming from HelloworldController class ****</h3>";
		 
        return new ModelAndView("welcome", "message", message);		
				         
				     
	}
}
