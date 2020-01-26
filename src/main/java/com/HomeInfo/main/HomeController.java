package com.HomeInfo.main;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String Welcome() {
		return "Welcome to Summary screen";
	}
	@RequestMapping(value = "/GetMessage/{id}", produces = "application/json; charset=UTF-8")
	@ResponseBody
	//@CrossOrigin(origins = "http://localhost:4200")

	public String Message(@PathVariable("id") String id) {
		
		return "Hello "+id+" Welcome to new world of Microservices";
		
	}

}
