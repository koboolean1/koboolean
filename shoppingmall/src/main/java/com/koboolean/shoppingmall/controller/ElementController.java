package com.koboolean.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ElementController {

	@RequestMapping(value="elements")
	public String elements() {
		return "elements";
	}
	
}
