package com.yash.rtd.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import com.yash.rtd.model.Gender;
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

	void initLists(Model model) {
		List<Gender> gender=new ArrayList<Gender>();
		gender=userDetailService.listGenderDetails();
		model.addAttribute("genderList", gender);
		
		
		
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
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
	@RequestMapping(value="/processLogin", method=RequestMethod.POST)
	public ModelAndView processLogin(@RequestParam("email") String email,
			@RequestParam("password") String password){
		//ToDo: login check: as per the user redirect on specified view
		UserDetail userDetail=new UserDetail();
		userDetail.setEmail(email);
		userDetail.setPassword(password);
		loggedInUser=userDetailService.authenticateUser(userDetail);
		//check that the role id is for employee.
		if(loggedInUser.getFk_role_id()==1){
		
		ModelAndView mav=new ModelAndView("user/admin/adminDashBoardpage");
		mav.addObject("loggedInUser", loggedInUser);
		return mav;
		}else if(loggedInUser.getFk_role_id()==2){
			
			ModelAndView mav=new ModelAndView("user/trainer/trainerDashBoardpage");
			mav.addObject("loggedInUser", loggedInUser);
			return mav;
		}else if(loggedInUser.getFk_role_id()==3){
				
			ModelAndView mav=new ModelAndView("user/trainee/traineeDashBoardpage");
			mav.addObject("loggedInUser", loggedInUser);
			return mav;
		}else if(loggedInUser.getFk_role_id()==4){
			
			ModelAndView mav=new ModelAndView("user/rtdManager/rtdManagerDashBoardpage");
			mav.addObject("loggedInUser", loggedInUser);
			return mav;
		}else if(loggedInUser.getFk_role_id()==5){
			
			ModelAndView mav=new ModelAndView("user/manager/managerDashBoardpage");
			mav.addObject("loggedInUser", loggedInUser);
			return mav;
		}else if(loggedInUser.getFk_role_id()==6){
			
			ModelAndView mav=new ModelAndView("user/mentor/mentorDashBoardpage");
			mav.addObject("loggedInUser", loggedInUser);
			return mav;
		}else if(loggedInUser.getFk_role_id()==7){
			
			ModelAndView mav=new ModelAndView("user/technical_evaluator/technical_evaluatorDashBoardpage");
			mav.addObject("loggedInUser", loggedInUser);
			return mav;
		}else if(loggedInUser.getFk_role_id()==8){
			
			ModelAndView mav=new ModelAndView("user/guest/guestDashBoardpage");
			mav.addObject("loggedInUser", loggedInUser);
			return mav;
		}
		return null;
	}
	@RequestMapping(value="/userRegistration",method=RequestMethod.GET)
	public String showRegistrationForm(Model model){
		//ModelAndView mav=new ModelAndView("/user/userRegistration");
		initLists(model);
		return "/user/userRegistration";
	}
	
	@RequestMapping(value="/processRegistration", method=RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userDetail") @Valid UserDetail userDetail, BindingResult bindingResult){
		ModelAndView mav=null;
		if(bindingResult.hasErrors()){
			System.out.println("error..");
			return ("/user/userRegistration");
		}
		else{
			try{
				userDetailService.insertUserDetail(userDetail);
				return "/user/userLogin";
				
			}
			
			catch(Exception ex){
				ex.printStackTrace();
				return "/user/errorPage";
	
			}
		}
	}	
}
