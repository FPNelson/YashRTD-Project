package com.yash.rtd.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		webDataBinder.registerCustomEditor(Date.class,"dob",new CustomDateEditor(dateFormat, true));
		webDataBinder.registerCustomEditor(Date.class, "doj", new CustomDateEditor(dateFormat, true));

	}
	@RequestMapping("/processLogin")
	public ModelAndView processLogin(@RequestParam("email") String email,
			@RequestParam("password") String password){
		//ToDo: login check: as per the user redirect on specified view
		UserDetail userDetail=new UserDetail();
		userDetail.setEmail(email);
		userDetail.setPassword(password);
		loggedInUser=userDetailService.authenticateUser(userDetail);
		//check that the role id is for employee.
		if(loggedInUser.getFk_role_id()==3){
		
		ModelAndView mav=new ModelAndView("/admin/adminDashBoard");
		mav.addObject("loggedInUser", loggedInUser);
		return mav;
		}
		return null;
	}
	@RequestMapping("/userRegistration")
	public ModelAndView showRegistrationForm(){
		ModelAndView mav=new ModelAndView("/user/userRegistration");
		return mav;
	}
	
	@RequestMapping(value="/processRegistration", method=RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userDetail") @Valid UserDetail userDetail, BindingResult bindingResult){
		ModelAndView mav=null;
		if(bindingResult.hasErrors()){
			return ("/user/userRegistration");
		}
		else{
			try{
				userDetailService.insertUserDetail(userDetail);
				return "/user/userLogin";
				
			}
			
			catch(Exception ex){
				return "/user/errorPage";
	
			}
		}
		
	}

}
