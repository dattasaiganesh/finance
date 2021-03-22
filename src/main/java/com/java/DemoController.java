package com.java;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.stereotype.Controller;  
@Controller  
public class DemoController 
{  
@RequestMapping("/hi")  
public String index()
{  
	System.out.println("in index2 page");
//returns to index.html
return"index";  
}  
@RequestMapping(value="/saves", method=RequestMethod.POST)  
public ModelAndView save(@ModelAttribute DemoUser user)
{  
ModelAndView modelAndView = new ModelAndView();  
modelAndView.setViewName("user-data");      
modelAndView.addObject("user", user);    
return modelAndView;  
}  
}  