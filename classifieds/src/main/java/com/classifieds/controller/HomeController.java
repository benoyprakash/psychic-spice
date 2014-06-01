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

@Controller(value = "/home")
public class HomeController {
	
	private static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getHome(HttpServletRequest request) {

		ModelMap mMap = new ModelMap();
		mMap.put(USER_DATA, "benoy");

		logger.info("End of getHome() function.");
		return new ModelAndView(HOME_VIEW, mMap);
	}
}
