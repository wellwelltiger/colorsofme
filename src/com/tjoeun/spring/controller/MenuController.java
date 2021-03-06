package com.tjoeun.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tjoeun.spring.service.ProductService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("/red_do")
	public ModelAndView red(ModelAndView mav) {
		mav.setViewName("menu/red");
		mav.addObject("list",productService.listProduct());	
		
		return mav;
	}
	
	@RequestMapping("/yellow_do")
	public ModelAndView orange(ModelAndView mav) {
		mav.setViewName("menu/yellow");
		mav.addObject("list",productService.listProduct());	
		
		return mav;
	}
	
	@RequestMapping("/green_do")
	public ModelAndView green(ModelAndView mav) {
		mav.setViewName("menu/green");
		mav.addObject("list",productService.listProduct());
		
		return mav;
	}
//	@RequestMapping("/orange")
//	public String orange() {
//		
//
//		
//		return "menu/orange";
//	}
	
	
	@RequestMapping("/detail")
	public String detail(@RequestParam("product_id") int product_id,Model model) {
		
		/*
		 * mav.setViewName("menu/detail");
		 * mav.addObject("dto",productService.detailProduct(product_id));
		 * mav.addObject("img",productService.imgProduct(product_id));
		 */
		model.addAttribute("dto",productService.detailProduct(product_id));
		 model.addAttribute("img",productService.imgProduct(product_id));
		 
		return "menu/detail";
	}
}
