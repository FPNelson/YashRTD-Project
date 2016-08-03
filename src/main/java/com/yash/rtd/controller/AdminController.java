package com.yash.rtd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.rtd.model.Location;
import com.yash.rtd.service.AdminService;


@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	@RequestMapping("/addLocation")
	public ModelAndView showAddLocationForm(){
		System.out.println("in add location");
		ModelAndView mav=new ModelAndView("/user/admin/addLocation");
		return mav;
	}
	

	@RequestMapping("/search")
	public ModelAndView search(){
		System.out.println("in search location");
		ModelAndView mav=new ModelAndView("/user/admin/addLocation");
		return mav;
	}
	
	@RequestMapping(value = "/processLocation",method=RequestMethod.POST)
	public ModelAndView processLocation(@ModelAttribute("location")Location location){
		adminService.insertLocation(location);
		System.out.println("Reached to controller");
		ModelAndView mav=new ModelAndView("/user/admin/adminDashBoard");
		return mav;	
	}
}
