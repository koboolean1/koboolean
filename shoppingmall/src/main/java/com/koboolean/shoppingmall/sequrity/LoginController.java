package com.koboolean.shoppingmall.sequrity;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class LoginController {
	
	@Autowired
	MemberRepository memberRepository;
	
	@PostMapping("")
	public String create(Member member) {
		MemberRole roleMemberRole = new MemberRole();
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		member.setUpw(passwordEncoder.encode(member.getUpw()));
		roleMemberRole.setRoleName("BASIC");
		member.setRoles(Arrays.asList(roleMemberRole));
		memberRepository.save(member);
		return "redirect:/";
	}
}