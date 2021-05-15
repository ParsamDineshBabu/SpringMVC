package com.dinesh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SimpleInterestController {
		@RequestMapping(value="/simpleForm.html",method=RequestMethod.GET)
		public ModelAndView getSimpleForm() {
			ModelAndView m2=new ModelAndView("SimpleForm");
			return m2;		
		}
		@RequestMapping(value="/resultForm.html",method=RequestMethod.POST)
		public ModelAndView resultForm(@RequestParam("pValue") int Pvalue,@RequestParam("rate") int Rate,@RequestParam("time") int Time) {
			ModelAndView m2=new ModelAndView("ResultForm");
			if(Pvalue>100000) {
				m2.addObject("hint2","Maximum Amount is less than 100000");
			}
			else {
			m2.addObject("hint"," Details submitted by you:: Principal: " +Pvalue+" Rate: "+Rate+" % "+" Time: "+Time+" Years ");
			double si;
			si=(Pvalue*Rate*Time)/100;
			m2.addObject("hint1"," Simple Interest: "+si);
			}
			return m2;		
		}
	}

