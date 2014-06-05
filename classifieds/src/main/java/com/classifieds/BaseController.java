package com.classifieds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {

	private static Logger logger = LoggerFactory
			.getLogger(BaseController.class);

	@RequestMapping(value = "/homeTrial", method = RequestMethod.GET)
	public void getHome() {
		logger.info("Request received - \"/home\"");
	}

}
