package com.vachiShop.controller.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vachiShop.service.ICategoryService;
import com.vachiShop.service.IProductService;

@Controller(value = "productControllerOfWeb")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@Autowired
	private ICategoryService categoryService;

	@RequestMapping(value = "/san-pham/{code}", method = RequestMethod.GET)
	public ModelAndView detailsPage(@PathVariable(value = "code", required = false) String code) {
		ModelAndView mav = new ModelAndView("web/productDetails");
		mav.addObject("model", productService.findByCode(code));
		return mav;
	}

	@RequestMapping(value = "/tim-kiem", method = RequestMethod.GET)
	public ModelAndView searchPage(@RequestParam(required = false) Map<String, String> params) {
		ModelAndView mav = new ModelAndView("web/productDetails");
		mav.addObject("products", productService.searchResults(params));
		mav.addObject("listCategory", categoryService.listCategory());
		return mav;
	}
}
