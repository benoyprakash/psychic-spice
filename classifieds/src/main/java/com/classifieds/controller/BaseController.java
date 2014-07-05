package com.classifieds.controller;

import org.slf4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;

import com.classifieds.authentication.SystemUserDetails;

public class BaseController {

	protected SystemUserDetails getUserDetails() {
		SystemUserDetails userDetails = (SystemUserDetails) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
		return userDetails;
	}

	protected static void categoryLog(Logger logger, String cat, Integer subId) {
		logger.info("call to category : " + cat + "and subcategory : " + subId);
	}

}
