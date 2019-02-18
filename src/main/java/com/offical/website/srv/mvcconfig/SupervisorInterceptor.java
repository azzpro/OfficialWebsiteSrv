package com.offical.website.srv.mvcconfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.offical.website.srv.constants.SrvConstants;
import com.offical.website.srv.pojo.ManagmentLoginUser;

@Component
public class SupervisorInterceptor extends HandlerInterceptorAdapter{

	Logger logger = LoggerFactory.getLogger(getClass());
	public boolean preHandle(HttpServletRequest request,    
			HttpServletResponse response, Object handler) throws Exception { 
		
		String uri = request.getRequestURI();
		logger.info("request url:"+uri);
		ManagmentLoginUser m = (ManagmentLoginUser) request.getSession().getAttribute(SrvConstants.SESSION_KEY);
		if(null==m){
			String contextPath = request.getContextPath();
			response.sendRedirect(contextPath+"/srv/management/goLogin");
			return false ;
		}
		return true ;
	}	
}
