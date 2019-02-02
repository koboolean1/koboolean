package com.koboolean.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenericController {
		@RequestMapping(value="/generic")
		public String generic() {
			return "generic";
		}
}
