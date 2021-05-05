package com.vachiShop.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "productControllerOfWeb")
public class ProductController {

	@RequestMapping(value = "/san-pham", method = RequestMethod.GET)
	public ModelAndView detailsPage() {
		ModelAndView mav = new ModelAndView("web/productDetails");
		return mav;
	}

}
