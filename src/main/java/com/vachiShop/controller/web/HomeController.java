package com.vachiShop.controller.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vachiShop.DTO.GooglePojo;
import com.vachiShop.service.IProductService;
import com.vachiShop.util.GoogleUtils;
import com.vachiShop.util.RestFB;

@Controller("HomeControllerOfWeb")
public class HomeController {
	
	@Autowired 
	private IProductService productService;
	
	 @Autowired
	  private GoogleUtils googleUtils;
	 
	 @Autowired
	 private RestFB restFB;
	

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");
		/*
		 * mav.addObject("listTopView", productService.listTopView());
		 * mav.addObject("listTopRated", productService.listTopRated());
		 * mav.addObject("listLatest", productService.listLatest());
		 * mav.addObject("listSaleOff", productService.listSaleOff());
		 */
		//list các product trong thể loại phổ biến(tầm 3 4 thể loại)
		//list category
		return mav;
	}
	
	@RequestMapping(value = "/dang-ky", method = RequestMethod.GET)
	public ModelAndView signUpPage() {
		ModelAndView mav = new ModelAndView("signUp");
		return mav;
	}
	
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping("/dang-nhap/google")
	  public String loginGoogle(HttpServletRequest request) throws ClientProtocolException, IOException {
	    String code = request.getParameter("code");
	    
	    if (code == null || code.isEmpty()) {
	      return "redirect:/dang-nhap/google?message=google_error";
	    }
	    String accessToken = googleUtils.getToken(code);
	    
	    GooglePojo googlePojo = googleUtils.getUserInfo(accessToken);
	    UserDetails userDetail = googleUtils.buildUser(googlePojo);
	    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetail, null,
	        userDetail.getAuthorities());
	    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    return "redirect:/trang-chu";
	  }
	
	 @RequestMapping("/dang-nhap/facebook")
	  public String loginFacebook(HttpServletRequest request) {
	    String code = request.getParameter("code");
	    String accessToken = "";
	    try {
	      accessToken = restFB.getToken(code);
	    } catch (IOException e) {
	      return "login?facebook=error";
	    }
	    com.restfb.types.User user = restFB.getUserInfo(accessToken);
	    UserDetails userDetail = restFB.buildUser(user);
	    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetail, null,
	        userDetail.getAuthorities());
	    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    return "redirect:/trang-chu";
	  }
	
	

}
