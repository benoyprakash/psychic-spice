package com.classifieds.service;

import javax.servlet.http.HttpServletRequest;

import net.tanesha.recaptcha.ReCaptchaImpl;
import net.tanesha.recaptcha.ReCaptchaResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class UtilityServices {

	public static String getIpAddress(HttpServletRequest request) {

		String ipAddress = request.getHeader("x-forwarded-for");
		if (StringUtils.isNotBlank(ipAddress)) {
			return ipAddress;
		}

		ipAddress = request.getHeader("X_FORWARDED_FOR");
		if (StringUtils.isNotBlank(ipAddress)) {
			return ipAddress;
		}

		ipAddress = request.getHeader("HTTP_X_FORWARDED_FOR");
		if (StringUtils.isNotBlank(ipAddress)) {
			return ipAddress;
		}
		ipAddress = request.getHeader("HTTP_CLIENT_IP");

		if (StringUtils.isNotBlank(ipAddress)) {
			return ipAddress;
		}
		ipAddress = request.getHeader("WL-Proxy-Client-IP");
		if (StringUtils.isNotBlank(ipAddress)) {
			return ipAddress;
		}

		ipAddress = request.getHeader("Proxy-Client-IP");
		if (StringUtils.isNotBlank(ipAddress)) {
			return ipAddress;
		}

		if (ipAddress == null) {
			ipAddress = request.getRemoteAddr();
		}
		return ipAddress;
	}

	public boolean isValidateRecaptchaSuccessful(HttpServletRequest request) {
		// https://developers.google.
		// com/recaptcha/docs/java?csw=1
		String remoteAddr = request.getRemoteAddr();
		ReCaptchaImpl reCaptcha = new ReCaptchaImpl();
		reCaptcha.setPrivateKey("6LeYwPYSAAAAAPBCnS05ah9eC7xhCxFX0Q4hdxXx");

		String challenge = request.getParameter("recaptcha_challenge_field");
		String uresponse = request.getParameter("recaptcha_response_field");
		ReCaptchaResponse reCaptchaResponse = reCaptcha.checkAnswer(remoteAddr,
				challenge, uresponse);

		return reCaptchaResponse.isValid();
	}

}
