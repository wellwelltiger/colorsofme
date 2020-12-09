package com.tjoeun.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tjoeun.spring.beans.UserDTO;
import com.tjoeun.spring.service.UserService;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	 @Autowired
	  private UserService userService;
	
	 @RequestMapping("userorder.do")
	 public String userinfo(UserDTO userDTO, Model model,HttpSession session) {
//		 String user_id = (String)session.getAttribute("user_id");
//		 
//		 if(user_id == null) {
//			 
//			 return "redirect:/user/login";
//		 }
//		 model.addAttribute("info",userService.UserInfo(user_id));
		 
		 return "userInfo/userorder";
	 }
}
