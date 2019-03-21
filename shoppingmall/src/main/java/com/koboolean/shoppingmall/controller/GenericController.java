package com.koboolean.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/generic")
public class GenericController {
	@RequestMapping(value="")
		public String generic() {
			return "generic";
		}
}
