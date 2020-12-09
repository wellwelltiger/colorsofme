package com.tjoeun.spring.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tjoeun.spring.beans.UserDTO;
import com.tjoeun.spring.service.UserService;
//import com.tjoeun.spring.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {
  
  @Autowired
  private UserService userService;
  
  @Resource(name="loginUserBean")
  @Lazy
  private UserDTO loginUserBean;
  
  
  @GetMapping("/login")
  public String login(
      @ModelAttribute("initloginUserBean") UserDTO initloginUserBean,
      @RequestParam(value="failed", defaultValue="false") boolean failed,
      Model model) {
      model.addAttribute("failed", failed);
    return "user/login";
  }   
  
  @PostMapping("/login_proc")
  public ModelAndView login_proc
  (@Valid @ModelAttribute("initloginUserBean") UserDTO initLoginUserBean,HttpSession session) { 
 
  boolean result = userService.getLoginUserInfo(initLoginUserBean, session);
  ModelAndView mav = new ModelAndView();
  
  if(result) {
  	mav.setViewName("user/login_done");
  }else {
  	mav.setViewName("user/login_failed");
  }
    
    return mav;
  }
  
  @RequestMapping("/logout.do") //logout.do에 매핑
  public ModelAndView logout(HttpSession session, ModelAndView mav) {
  	userService.logout(session); //세션 초기화 작업
     mav.setViewName("user/logout"); //이동할 페이지의 이름
     
      return mav; //페이지로 이동
  }

  
  
  @GetMapping("/join")
  public String join(@ModelAttribute("userDTO") UserDTO userDTO) {
    return "user/join";
  }

  @PostMapping("/join_proc")
  public String join_proc(@Valid @ModelAttribute("userDTO") UserDTO userDTO, BindingResult result) {
    if(result.hasErrors()) {
      return "user/join";
    }
    
    userService.insertUserInfo(userDTO);
    
    return "user/join_done";
  }
  
  @GetMapping("/modify")
  public String modify() {
    return "user/modify";
  }
  
  @GetMapping("/logout")
  public String logout() {
    return "user/logout";
  }
  

 @GetMapping("/not_login")
	public String not_login() {
		return "user/not_login";
	} 
  
  // user validator 등록하기
	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) { UserValidator
	 * validator1 = new UserValidator(); binder.addValidators(validator1); }
	 */
}
