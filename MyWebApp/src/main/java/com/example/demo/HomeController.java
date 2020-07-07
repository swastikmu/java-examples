package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
//	public String home(HttpServletRequest req) {
//		
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
//		System.out.println("hi"  + name);
//		session.setAttribute("name", name);
//		return "home";
//	}
	//both ways it will work. you can omit Httpservlet Request.
//	public ModelAndView home(@RequestParam("name") String name1) {
//		
////		HttpSession session = req.getSession();
////		String name = req.getParameter("name");
//		ModelAndView mv = new ModelAndView();
//		
//		mv.addObject("name" , name1);
//		mv.setViewName("home");
////		System.out.println("hi"  + name1);
////		session.setAttribute("name", name1);
////		return "home";
//		return mv;
//	}
	
	//using a object
	public ModelAndView home(Alien alien) {
		
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("obj" , alien);
		mv.setViewName("home");
//		System.out.println("hi"  + name1);
//		session.setAttribute("name", name1);
//		return "home";
		return mv;
	}
	
}
