package com.classifieds.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
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
	
}
