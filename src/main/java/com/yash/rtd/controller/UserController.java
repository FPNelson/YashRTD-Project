package com.yash.rtd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.rtd.dao.UserDetailDao;
import com.yash.rtd.model.UserDetail;
import com.yash.rtd.service.UserDetailService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserDetailService userDetailService;
	
	UserDetail loggedInUser=null;
	
	public void setUserDetailService(UserDetailService userDetailService) {
		this.userDetailService = userDetailService;
	}
	@RequestMapping("/login")
	public ModelAndView showLoginForm(){
		ModelAndView mav=new ModelAndView("/user/userLogin");
		return mav;
	}
	@RequestMapping("/processLogin")
	public ModelAndView processLogin(@RequestParam("email") String email,
			@RequestParam("password") String password){
		//ToDo: login check: as per the user redirect on specified view
		System.out.println("herer...");
		UserDetail userDetail=new UserDetail();
		userDetail.setEmail(email);
		userDetail.setPassword(password);
		loggedInUser=userDetailService.authenticateUser(userDetail);
		if(loggedInUser.getFk_role_id()==3){
		
		ModelAndView mav=new ModelAndView("/admin/adminDashBoard");
		mav.addObject("loggedInUser", loggedInUser);
		System.out.println("mav:"+mav.getViewName());
		return mav;
		}
		return null;
	}
	

}
