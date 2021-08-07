package com.hcl.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController 
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView show()
	{
		ModelAndView mav=new ModelAndView("home");
		return mav;
	}
	
	@GetMapping("/user")
	public @ResponseBody String getAllusers(@RequestParam(value = "deviceId", required = false) String deviceId)
	{
		System.out.println(deviceId);
		
		return "user";
	}

}
