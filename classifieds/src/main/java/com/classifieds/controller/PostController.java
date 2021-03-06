package com.classifieds.controller;

import static com.classifieds.utils.Views.ADD_POST;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.classifieds.service.PostService;
import com.classifieds.service.UtilityServices;
import com.classifieds.utils.ReferenceConstants;
import com.classifieds.web.model.PostInfo;

@Controller
public class PostController {

	@Autowired
	private PostService postService;
	
	@Autowired 
	private UtilityServices utilityServices;
	
	private final String CAPTCHA_WORNG_MSG = "Please re-enter the captcha, you might have typed a worng one.";
	

	private Logger logger = LoggerFactory.getLogger(PostController.class);

	// @RequestMapping(value = "add/category/select", method =
	// RequestMethod.GET)
	// public ModelAndView selectCategory() {
	// logger.info("selectCategory()");
	// ModelMap mMap = new ModelMap();
	// logger.info("End of selectCategory()");
	// return new ModelAndView(ADD_POST, mMap);
	// }

	// according to category, redirect to corresponding controller
	@RequestMapping(value = "/post/add", method = RequestMethod.GET)
	public ModelAndView addPost(PostInfo adPostInfo) {
		logger.info("redirectToCategory()");
		
		ModelMap mMap = new ModelMap();
		
		if(adPostInfo == null){
			adPostInfo = new PostInfo();
		}
		adPostInfo.setAdDesc("");
		adPostInfo.setAllCategories(ReferenceConstants.CategoryList.getKeyValueMap());
		mMap.put("adpost", adPostInfo);
		logger.info("End of addPost()");
		return new ModelAndView(ADD_POST, mMap);
	}

	// Phase 2
	// to preview after the inputs are done
	@RequestMapping(value = "/post/add/preview", method = RequestMethod.GET)
	public ModelAndView previewPost() {
		logger.info("redirectToCategory()");
		ModelMap mMap = new ModelMap();
		mMap.put("adpost", new PostInfo());
		logger.info("End of addPost()");
		return new ModelAndView(ADD_POST, mMap);
	}

	// to save the post
	@RequestMapping(value = "/post/add/save", method = RequestMethod.POST)
	public ModelAndView savePost(@ModelAttribute("adpost") PostInfo adPostInfo, HttpServletRequest request, ModelMap mMap) {
		logger.info("redirectToCategory()");
		if(mMap == null){
			mMap = new ModelMap();
		}
		if(!utilityServices.isValidateRecaptchaSuccessful(request)){
//			mMap.put("errorMessage", CAPTCHA_WORNG_MSG);
			mMap.addAttribute("captchaError", CAPTCHA_WORNG_MSG);
			addPost(adPostInfo);
		}
		
		logger.info("End of addPost()");
		return new ModelAndView(ADD_POST, mMap);
	}

	@RequestMapping(value = "/post/add/activate", method = RequestMethod.GET)
	public ModelAndView activatePost() {
		logger.info("activatePost()");
		ModelMap mMap = new ModelMap();

		logger.info("End of activatePost()");
		return new ModelAndView("", mMap);
	}

	@RequestMapping(value = "/post/add/suspend", method = RequestMethod.GET)
	public ModelAndView suspendPost() {
		logger.info("suspendPost()");
		ModelMap mMap = new ModelMap();

		logger.info("End of suspendPost()");
		return new ModelAndView("", mMap);
	}

}
