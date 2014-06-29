package com.classifieds.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.classifieds.controller.BaseController;
import static com.classifieds.utils.Views.LANDING_PAGE_VIEW;

@Controller
@RequestMapping("/home")
public class LandingController extends BaseController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView landingPage(HttpServletRequest request) {
		ModelMap model = new ModelMap();
		model.put("header", "header");

		return new ModelAndView(LANDING_PAGE_VIEW, model);
	}
}
