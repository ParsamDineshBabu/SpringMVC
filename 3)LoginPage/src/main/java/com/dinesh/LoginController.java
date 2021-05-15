package com.dinesh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController {
		@RequestMapping(value="/loginForm.html",method=RequestMethod.GET)
		public ModelAndView getSimpleForm() {
			ModelAndView m2=new ModelAndView("LoginForm");
			return m2;		
		}
		@RequestMapping(value="/resultForm.html",method=RequestMethod.POST)
		public ModelAndView resultForm(@RequestParam("user") String username,@RequestParam("pass") String password,@RequestParam("email") String email) {
			ModelAndView m2=new ModelAndView("ResultForm");
			if(username.equalsIgnoreCase("dinesh") && password.equals("dinesh")) {
				m2.addObject("msg","Login Successfully!");
				m2.addObject("msg1","Hi "+username);
			}
			else {
			m2.addObject("msg2","Login Failed! Please Check the details");
			}
			return m2;		
		}
	}

