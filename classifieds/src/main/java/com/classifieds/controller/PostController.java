package com.classifieds.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.classifieds.service.PostService;

import static com.classifieds.utils.Views.ADD_POST;
@Controller("/post")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	private Logger logger = LoggerFactory.getLogger(PostController.class);

	@RequestMapping(value = "add/category/select", method = RequestMethod.GET)
	public ModelAndView selectCategory() {
		logger.info("selectCategory()");
		ModelMap mMap = new ModelMap();

		logger.info("End of selectCategory()");
		return new ModelAndView(ADD_POST, mMap);
	}
	
	// according to category, redirect to corresponding controller
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView redirectToCategory() {
		logger.info("redirectToCategory()");
		ModelMap mMap = new ModelMap();

		logger.info("End of addPost()");
		return new ModelAndView("", mMap);
	}
	
	@RequestMapping(value = "/add/activate", method = RequestMethod.GET)
	public ModelAndView activatePost() {
		logger.info("activatePost()");
		ModelMap mMap = new ModelMap();

		logger.info("End of activatePost()");
		return new ModelAndView("", mMap);
	}
	
	@RequestMapping(value = "/add/suspend", method = RequestMethod.GET)
	public ModelAndView suspendPost() {
		logger.info("suspendPost()");
		ModelMap mMap = new ModelMap();

		logger.info("End of suspendPost()");
		return new ModelAndView("", mMap);
	}
	
	
	
	
	
	
	
	
	
	
}
