package com.care.root.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired	MemberService ms;
	public MemberController() {
		System.out.println("controller");
	}
	@RequestMapping("insert")
	public String insert() {
		System.out.println("ms : "+ms);
		//MemberService ms = 
					//new MemberService();
		ms.insert();
		
		return "index";
	}
}




