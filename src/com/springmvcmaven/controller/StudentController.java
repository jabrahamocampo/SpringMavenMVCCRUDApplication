package com.springmvcmaven.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springtutorial.configurationandbean.HelloWorld;
import com.springtutorial.mvc.Student;

@Controller
public class StudentController {
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student(){
		return new ModelAndView("student","command", new Student());
	}
	
	@RequestMapping(value="/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model){
		model.addAttribute("age", student.getAge());
		model.addAttribute("name", student.getName());
		model.addAttribute("id", student.getId());
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
//		HelloWorld hello = (HelloWorld)context.getBean("helloWorld");
//		model.addAttribute("hellomessage",hello.getMessage());
		return "result";
	}
}
