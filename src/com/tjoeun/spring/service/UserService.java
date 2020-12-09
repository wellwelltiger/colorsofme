package com.tjoeun.spring.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.tjoeun.spring.beans.UserDTO;
import com.tjoeun.spring.dao.UserDAO;

@Service
public class UserService {
  
  @Autowired
  private UserDAO userDAO;
  
  @Resource(name="loginUserBean")
  @Lazy
  private UserDTO loginUserBean;
  
  public boolean checkUserId(String user_id) {
    String user_name = userDAO.checkUserId(user_id);  
    
    if(user_name == null) {
      return true;
    }else {
      return false;
    }
  }
  public void insertUserInfo(UserDTO userDTO) {
    userDAO.insertUserInfo(userDTO);
  }
  public boolean getLoginUserInfo(UserDTO initLoginUserBean ,HttpSession session) {
    
    boolean result = userDAO.getLoginUserInfo(initLoginUserBean);
		
		if(result == true) {
			session.setAttribute("user_id", initLoginUserBean.getUser_id());
		
		}
		return result;
  }
  
  public void logout(HttpSession session) {

  	userDAO.logout(session);
	}
  
  public UserDTO UserInfo(String user_id) {
  	
  	return userDAO.UserInfo(user_id);
  	 
  }
  
}
