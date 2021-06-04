package com.vachiShop.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vachiShop.service.ICartService;

@Controller
public class CartController {
	
	@Autowired
	private ICartService cartService;
	
	@RequestMapping(value = "/gio-hang", method = RequestMethod.GET)
	public ModelAndView pageCard(@RequestParam(value = "userId",required = false) Long userId) {
		//laay id tuw authentication
		if(userId==null) {
			return new ModelAndView("redirect:/dang-nhap");
		}else {
			ModelAndView mav = new ModelAndView("web/cart");
			mav.addObject("productsOnCart", cartService.productsOnCart(userId));
			return mav;
		}
		
	}

}
