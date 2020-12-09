package com.tjoeun.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tjoeun.spring.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	GameService gameSerivce;

	@RequestMapping("/main1")
	public String game() {
		
		
		return "game/main1";
	}
	
	@RequestMapping("/result")
	public String result(@RequestParam("color") String color) {
		
		
		gameSerivce.game(color);
		
		System.out.println(color);
		
		return "game/result";
	}
	
}
