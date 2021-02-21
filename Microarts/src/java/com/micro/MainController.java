package com.micro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/show")
	public ModelAndView show() {
		
		
		System.out.println("Hello");
		ModelAndView modelAndView = new ModelAndView("show");
        return modelAndView;
		
	}
	
	@RequestMapping("/ok")
	public ModelAndView ok() {
		
		
		System.out.println("ok");
		ModelAndView modelAndView = new ModelAndView("ok");
        return modelAndView;
		
	}
	
	@RequestMapping("/shop")
	public ModelAndView shop() {
		
		
		
		ModelAndView modelAndView = new ModelAndView("shop");
        return modelAndView;
		
	}
	@RequestMapping("/home")
	public ModelAndView home() {

		ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
		
	}
	
	
	

}
