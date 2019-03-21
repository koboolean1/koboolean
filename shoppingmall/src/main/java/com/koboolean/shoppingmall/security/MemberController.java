package com.koboolean.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class SignUpController {
	
	@RequestMapping(value = "")
	public String signUp() {
		return "signUp";
	}
}
