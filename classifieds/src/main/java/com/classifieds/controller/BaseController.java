package com.classifieds.controller;

import org.springframework.security.core.context.SecurityContextHolder;

import com.classifieds.authentication.SystemUserDetails;

public class BaseController {

    protected SystemUserDetails getUserDetails() {
    	SystemUserDetails userDetails =
                (SystemUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails;
    }
    
    
}
