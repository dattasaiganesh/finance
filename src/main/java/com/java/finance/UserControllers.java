package com.java.finance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserControllers {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String index() {
		System.out.println("in index page");
		return "index";
	}
	
	@RequestMapping(value="/save",  method=RequestMethod.POST)
	public String saveUser(@ModelAttribute User user) {
		System.out.println(" in UserController Method");
		userService.saveUser(user);
		   
		// return "/getUsers";
		return "redirect:/getUsers";
		 
			/*ModelAndView modelAndView = new ModelAndView();  
			modelAndView.setViewName("user-data");      
			modelAndView.addObject("user", user); 
			
			return modelAndView;*/
	}
	
	@RequestMapping(value="/getUsers")
	public ModelAndView getAll(@ModelAttribute User user) {
		
		List<User> user1 = userService.getAll();
        System.out.println("in getAll method");
		ModelAndView modelAndView = new ModelAndView();  
		modelAndView.setViewName("user-data");      
		modelAndView.addObject("user", user1); 
		System.out.println("user value "+user1);
		return modelAndView;
	}
}
