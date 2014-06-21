package com.classifieds.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public class CategoryHomeController {
	
	private Logger logger = LoggerFactory.getLogger(CategoryHomeController.class);

	@RequestMapping(value = "/category/home/add", method = RequestMethod.GET)
	public ModelAndView addPost() {
		logger.info("addPost()");
		ModelMap mMap = new ModelMap();

		logger.info("End of addPost()");
		return new ModelAndView("", mMap);
	}
	
	@RequestMapping(value = "/category/home/add/save", method = RequestMethod.GET)
	public ModelAndView savePost() {
		logger.info("savePost()");
		ModelMap mMap = new ModelMap();

		logger.info("End of savePost()");
		return new ModelAndView("", mMap);
	}
}
