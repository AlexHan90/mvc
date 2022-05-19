package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("index1")
	public String testIndex() {
		System.out.println("Aaaaaa");
		return "member/index";
	}
	@RequestMapping("logout")
	public String testLogout(Model model) {
		model.addAttribute("test", "내용 전달");
		return "member/logout";
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login","로그인 값 전달");
		mv.setViewName("member/login");
		return mv;
	}
}










