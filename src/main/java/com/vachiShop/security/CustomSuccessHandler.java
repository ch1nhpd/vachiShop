package com.vachiShop.security;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.vachiShop.util.SecurityUtils;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
	
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	
	
	
	@Override
	protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		String targetUrl = determineTargetUrl(authentication);
		if (!response.isCommitted()) {
			redirectStrategy.sendRedirect(request, response, targetUrl);
		}
	}


	private String determineTargetUrl(Authentication authentication) {
		String url = "";
		List<String> roles =  SecurityUtils.getAuthorities();

		if (isAdmin(roles)) {
			url = "/quan-tri/trang-chu";
		}else{
			url = "/trang-chu";
		}

		return url;
	}


	private boolean isAdmin(List<String> roles) {
		return roles.contains("ADMIN");
	}
}
