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
	public String processLogin(@RequestParam("email") String email,
			@RequestParam("password") String password,Model model){
		//ToDo: login check: as per the user redirect on specified view
		UserDetail userDetail=new UserDetail();
		userDetail.setEmail(email);
		userDetail.setPassword(password);
		loggedInUser=userDetailService.authenticateUser(userDetail);
		
		//check that the role id is for employee.
		if(loggedInUser.getFk_role_id()==1){
			
		model.addAttribute("loggedInUser", loggedInUser);
		return "user/admin/adminDashBoard";
		}else if(loggedInUser.getFk_role_id()==2){
			
			model.addAttribute("loggedInUser", loggedInUser);
			return "user/trainer/trainerDashBoardpage";
		}else if(loggedInUser.getFk_role_id()==3){
		
			model.addAttribute("loggedInUser", loggedInUser);
			return "user/trainee/traineeDashBoardpage";
		}else if(loggedInUser.getFk_role_id()==4){
			
			model.addAttribute("loggedInUser", loggedInUser);
			return "user/rtdManager/rtdManagerDashBoardpage";
		}else if(loggedInUser.getFk_role_id()==5){
			
			model.addAttribute("loggedInUser", loggedInUser);
			return "user/manager/managerDashBoardpage";
		}else if(loggedInUser.getFk_role_id()==6){
			
			model.addAttribute("loggedInUser", loggedInUser);
			return "user/mentor/mentorDashBoardpage";
		}else if(loggedInUser.getFk_role_id()==7){
			
			model.addAttribute("loggedInUser", loggedInUser);
			return "user/technical_evaluator/technical_evaluatorDashBoardpage";
		}else if(loggedInUser.getFk_role_id()==8){
			
			model.addAttribute("loggedInUser", loggedInUser);
			return "user/guest/guestDashBoardpage";
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
