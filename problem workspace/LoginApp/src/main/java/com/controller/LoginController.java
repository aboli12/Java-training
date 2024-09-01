package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	Login login;
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "signup",method = RequestMethod.POST)
	public ModelAndView doSignup(HttpServletRequest req) {	// DI for request object
		login.setEmailid(req.getParameter("emailid"));
		login.setPassword(req.getParameter("password"));
		login.setTypeofuser(req.getParameter("typeofuser"));
		ModelAndView mav = new ModelAndView();
		if("success".equalsIgnoreCase(loginService.doSignup(login))) {
			mav.setViewName("success.jsp");
		}
		return mav;
	}
	
	@RequestMapping(value = "signin",method = RequestMethod.POST)  // di for request object 
	public ModelAndView doSignin(HttpServletRequest req) {
		login.setEmailid(req.getParameter("emailid"));
		login.setPassword(req.getParameter("password"));
		ModelAndView mav = new ModelAndView();
		if("admin".equalsIgnoreCase(loginService.doSignin(login))) {
			mav.setViewName("admin.jsp");
		}else {
			mav.setViewName("customer.jsp");
		}
		return mav;
	}
}