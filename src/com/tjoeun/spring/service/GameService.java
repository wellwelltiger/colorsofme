package com.tjoeun.spring.service;

import org.springframework.stereotype.Service;

@Service
public class GameService {

	public String game(String color) {
		
		
		boolean choose =false;
		if(color != null) {
		if(choose) {
			
			color += "1";
			
		}
		else {
			color +="0";
		  }
		}
		return "color";
	}
	
}
