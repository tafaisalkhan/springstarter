package com.spring.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.spring.UserSession;
import com.spring.UserToken;
import com.spring.utils.Constants;

public class GlobalInterceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	private UserToken userToken;
	
	@Autowired
	private UserSession userSession;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		if(request.getRequestURI().equalsIgnoreCase(Constants.LOGIN_PATH)){
			userToken.setToken("valid Request");
			request.getAttribute("status");
			return super.preHandle(request, response, handler);
		}
		else if(request.getHeader("token") == null || request.getHeader("token").equalsIgnoreCase("")){
			userToken.setToken("Invalid Request");
			return super.preHandle(request, response, handler);
		
		}
		else{
			if (userSession == null){
				userToken.setToken("Invalid Request");
			}
			else{
				userToken.setToken(request.getHeader("token"));
			}
			System.out.println("token fond in request" + userToken.getToken());
			return super.preHandle(request, response, handler);
		}
	}
	
}
