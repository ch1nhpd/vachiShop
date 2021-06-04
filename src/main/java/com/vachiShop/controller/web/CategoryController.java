package com.vachiShop.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vachiShop.service.ICategoryService;

@Controller("CategoryControllerOfWeb")
public class CategoryController {
	
	@Autowired
	private ICategoryService categoryService;
	
	//giống search bên productController
	@RequestMapping(value = "/the-loai/{code}", method = RequestMethod.GET)
	public ModelAndView category(@PathVariable("code") String code, @RequestParam(value = "page", defaultValue = "1", required = false) int page) {
		ModelAndView mav = new ModelAndView("web/shopGrid");
		mav.addObject("listProductsOfCategory", categoryService.listProductOf(code,page));
		mav.addObject("listCategory", categoryService.listCategory());
		return mav;
	}
}
