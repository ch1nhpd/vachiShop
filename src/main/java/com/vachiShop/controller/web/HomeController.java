package com.vachiShop.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vachiShop.service.IProductService;

@Controller("HomeControllerOfWeb")
public class HomeController {
	
	@Autowired 
	private IProductService productService;
	

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");
		mav.addObject("listTopView", productService.listTopView());
		mav.addObject("listTopRated", productService.listTopRated());
		mav.addObject("listLatest", productService.listLatest());
		mav.addObject("listSaleOff", productService.listSaleOff());
		//list các product trong thể loại phổ biến(tầm 3 4 thể loại)
		//list category
		return mav;
	}

}
