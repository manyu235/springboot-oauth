package com.example.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/oauth/v1/")
public class TestController 
{
	@RequestMapping(value="home")
	public String getHome()
	{
		return "Test Controller as call back from Git oauth service";
	}
	
}
