package com.koboolean.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="elements")
public class ElementController {

	@RequestMapping(value="")
	public String elements() {
		return "elements";
	}
	
}
