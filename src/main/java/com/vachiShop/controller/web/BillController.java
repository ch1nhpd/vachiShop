package com.vachiShop.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vachiShop.DTO.BillDTO;
import com.vachiShop.DTO.BillProductDTO;
import com.vachiShop.DTO.ProductCartDTO;
import com.vachiShop.service.IBillProductService;
import com.vachiShop.service.IBillService;
import com.vachiShop.service.IProductCartService;

@Controller
public class BillController {

	@Autowired
	private IBillService billService;

	@Autowired
	private IProductCartService productCartService;

	@RequestMapping(value = "/dat-hang", method = RequestMethod.POST)
	public ModelAndView pageCheckout(@RequestBody List<ProductCartDTO> productCarts) {
		ModelAndView mav = new ModelAndView("web/checkout");
		mav.addObject("productCart", productCarts);
		productCartService.update(productCarts);
		return mav;
	}

	@RequestMapping(value = "/dat-hang/hoan-tat", method = RequestMethod.GET)
	public ModelAndView pageCheckouted(@RequestBody BillDTO bill) {
		billService.save(bill);
		return new ModelAndView("redirect:/gio-hang");
	}

}
