package com.classifieds.controller;

import static com.classifieds.utils.Constants.USER_DATA;
import static com.classifieds.utils.Views.HOME_VIEW;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

	private static Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getHome(HttpServletRequest request) {
		logger.info("getHome() requested by : "+ getIpAddress(request));
		ModelMap mMap = new ModelMap();
		mMap.put(USER_DATA, "benoy");

		logger.info("End of getHome() function.");
		return new ModelAndView(HOME_VIEW, mMap);
	}
	
	public String getIpAddress(HttpServletRequest request){
		// request.getHeader("HTTP_X_FORWARDED_FOR");
		// request.getHeader("HTTP_CLIENT_IP");
		// request.getHeader("WL-Proxy-Client-IP");
		// request.getHeader("Proxy-Client-IP");
		String ipAddress = request.getHeader("x-forwarded-for");
        if (ipAddress == null) {
            ipAddress = request.getHeader("X_FORWARDED_FOR");
            if (ipAddress == null){
                ipAddress = request.getRemoteAddr();
            }
        }   
		   return ipAddress;
	}
}
