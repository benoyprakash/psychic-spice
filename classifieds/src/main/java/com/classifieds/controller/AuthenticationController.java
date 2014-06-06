package com.classifieds.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class AuthenticationController {

	@RequestMapping(method = RequestMethod.GET)
	public String authenticator(ModelMap model,
			final RedirectAttributes redirectAttributes, HttpServletRequest request) {
//		CustomUserDetails userDetails = this.getUserDetails();
//		if (userDetails == null) {
//			return LOGIN_VIEW;
//		} else if (userDetails.getUserAccount().getUserAccountLocked() > 0) {
		SecurityContextHolder.clearContext();
			// TODO Move this to message.properties.
//			model.addAttribute(MESSAGE, userAccountIsLocked);
//			return ERROR_VIEW;
//		} else if (userService.checkDatabase(
//				userDetails.getUserAccount().getUserId())
//				.getUserActivationDate() == null) {
//			// TODO Move this to message.properties.
//			model.addAttribute(MESSAGE, emailVerificationPending);
//			SecurityContextHolder.clearContext();
//			return ERROR_VIEW;
//		} else {
//		  //is client behind something?
//		    String ipAddress = request.getHeader("X-FORWARDED-FOR");  
//		    if (ipAddress == null) {  
//		        ipAddress = request.getRemoteAddr();  
//		    }
//			userDetails.setIpAddress(ipAddress);
//			model.addAttribute(MESSAGE, userService
//					.makeFirstLetterCaps(userDetails.getUserAccount()
//							.getUserFirstName()));
//			if (userService.checkDatabase(
//					userDetails.getUserAccount().getUserId()).getUserType() == 0) {
//				UserFullRegInfo loginInfo = userService
//						.getUserTypeInfo(userDetails.getUserAccount());
//				model.addAttribute(LOGIN_INFO, loginInfo);
//				model.addAttribute("serverurl", userService.pictureUrl());
//				model.addAttribute(USER_INFO, userDetails.getUserAccount());
//				// auditUser(userDetails);//new user reg
//				return USER_TYPE_VIEW;
//			} else if (userService.checkDatabase(
//					userDetails.getUserAccount().getUserId()).getPwdChanged() == 0) {
//				redirectAttributes.addFlashAttribute(PWDMESSAGE,
//						"Please change your Password.");
//				auditUser(userDetails);
//				return REDIRECT + PROFILE_PATH;
//			} else
//				auditUser(userDetails);
			return /*REDIRECT + ORG_FETCH_PATH*/ "";
//		}
	}

//	private void auditUser(CustomUserDetails userDetails) {
//		auditService.updateAuditLogByEntityId(
//				Constant.ENTITY_TYPE_USERACCOUNT,
//				"User",
//				AuditOperation.OPERATION_LOGIN,
//				"User "
//						+ StringUtils.capitalize(userDetails.getUserAccount()
//								.getUserLastName())
//						+ " "
//						+ StringUtils.capitalize(userDetails.getUserAccount()
//								.getUserFirstName()) + " ["
//						+ userDetails.getUserAccount().getUserId() + "]"
//						+ " has " + AuditOperation.OPERATION_LOGIN.getDesc(),
//				"", userDetails.getUserAccount(), new Date(), null);
//	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String login(ModelMap model) {
//		return LOGIN_VIEW;
//	}
//
//	@RequestMapping(value = "/forgotPassword", method = RequestMethod.GET)
//	public String forgotPasswordStep1(ModelMap model,
//			@ModelAttribute(FULL_REG_INFO) UserFullRegInfo userFullRegInfo) {
//		return FORGOT_PASSWORD_STEP1_VIEW;
//	}
//
//	@RequestMapping(value = "/forgotPassword/step1", method = RequestMethod.POST)
//	public ModelAndView forgotPasswordStep1Submit(
//			@ModelAttribute(FULL_REG_INFO) UserFullRegInfo userFullRegInfo,
//			ModelMap model) {
//		UserAccount userAccount = userService
//				.getUserAccountByUserEmailId(userFullRegInfo.getUserEmailId());
//		if (userAccount != null) {
//			Map<String, Object> modelForView = new HashMap<String, Object>();
//			userFullRegInfo.setUserEmailId(userFullRegInfo.getUserEmailId());
//			if (userAccount.getUserSecurityQuestion_1() != 0) {
//				userFullRegInfo.setSecurityQ1(EnumConstants.SecurityQuestion
//						.getTypeFromCode(
//								userAccount.getUserSecurityQuestion_1())
//						.getLabel());
//				userFullRegInfo.setSecurityQ2(EnumConstants.SecurityQuestion
//						.getTypeFromCode(
//								userAccount.getUserSecurityQuestion_2())
//						.getLabel());
//				modelForView.put(FULL_REG_INFO, userFullRegInfo);
//				return new ModelAndView(FORGOT_PASSWORD_STEP2_VIEW,
//						modelForView);
//			} else {
//				model.addAttribute(MESSAGE, userEmailVerificationPending);
//			}
//		}
//		// model.addAttribute("message",
//		// "Email Id '"+userFullRegInfo.getUserEmailId() +
//		// "' doesn't exists in the system.");
//		return new ModelAndView(ERROR_VIEW, null);
//	}
//
//	@RequestMapping(value = "/forgotPassword/step2", method = RequestMethod.POST)
//	public String acceptForgotPasswordStep2(
//			@ModelAttribute(FULL_REG_INFO) UserFullRegInfo userFullRegInfo,
//			@RequestParam("recaptcha_challenge_field") String challangeField,
//			@RequestParam("recaptcha_response_field") String responseField,
//			ServletRequest servletRequest, ModelMap model) {
//		String remoteAddress = servletRequest.getRemoteAddr();
//		ReCaptchaResponse reCaptchaResponse = this.reCaptchaImpl.checkAnswer(
//				remoteAddress, challangeField, responseField);
//		// Validate captcha input from user.
//		if (reCaptchaResponse.isValid()) {
//			UserAccount userAccount = userService
//					.getUserAccountByUserEmailId(userFullRegInfo
//							.getUserEmailId());
//			// Check if the email exists in the System
//			if (userAccount == null) {
//				model.addAttribute(MESSAGE,
//						"Email Id '" + userFullRegInfo.getUserEmailId()
//								+ "' doesn't exists in the system.");
//				return ERROR_VIEW;
//			} else {
//				if (!userFullRegInfo.getAns1().equalsIgnoreCase(
//						userAccount.getUserSecurityAnswer_1())) {
//					model.addAttribute(MESSAGE, String.format(
//							securityAnswerNoMatch, userFullRegInfo.getAns1()));
//					return ERROR_VIEW;
//				}
//				if (!userFullRegInfo.getAns2().equalsIgnoreCase(
//						userAccount.getUserSecurityAnswer_2())) {
//					model.addAttribute(MESSAGE, String.format(
//							securityAnswerNoMatch, userFullRegInfo.getAns2()));
//					return ERROR_VIEW;
//				}
//				// Success, send password reset token.
//				try {
//					// Test 6 - acceptForgotPasswordStep2Test6
//					userService.forgotPasswordRequest(userAccount.getUserId());
//					model.addAttribute(MESSAGE, String.format(
//							emailSentToResetYourPassword,
//							userFullRegInfo.getUserEmailId()));
//					log.info("The user email id is"+userFullRegInfo.getUserEmailId());
//					return SUCCESS_VIEW;
//				} catch (MessagingException e) {
//					// TODO Can we handle it gracefully instead of supressesing
//					log.error(e.getMessage(), e);
//					return ERROR_VIEW;
//				}
//			}
//		} else {
//			// TODO Move this to message.properties.
//			model.addAttribute(MESSAGE, enterCaptchaString);
//			log.error(enterCaptchaString);
//			return ERROR_VIEW;
//		}
//	}
//
//	@RequestMapping(value = "/resetPassword/{emailId}/{passwordResetCode}", method = RequestMethod.GET)
//	public ModelAndView resetPassword(@PathVariable("emailId") String emailId,
//			@PathVariable("passwordResetCode") String passwordResetCode,
//			ModelMap model) {
//		UserAccount userAccount = userService
//				.getUserAccountByUserEmailId(emailId);
//		if (userAccount != null
//				&& passwordResetCode != null
//				&& passwordResetCode.equals(userAccount
//						.getUserPasswordResetToken())) {
//			ResetPassword resetPassword = new ResetPassword();
//			resetPassword.setResetPasswordToken(userAccount
//					.getUserPasswordResetToken());
//			Map<String, Object> modelForView = new HashMap<String, Object>();
//			modelForView.put(RESET_PASSWORD, resetPassword);
//			log.info("After restting the password is :"+passwordResetCode);
//			return new ModelAndView(RESET_PASSWORD_VIEW, modelForView);
//		} else {
//			model.addAttribute(MESSAGE, invalidPasswordCodeMessage);
//			return new ModelAndView(ERROR_VIEW, model);
//		}
//
//	}
//
//	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
//	public String resetPassword(
//			@ModelAttribute(RESET_PASSWORD) ResetPassword resetPassword,
//			ModelMap model) {
//		UserAccount userAccount = userService
//				.getUserAccountByUserPasswordResetToken(resetPassword
//						.getResetPasswordToken());
//		if (userAccount != null) {
//			userService.resetPassword(userAccount, resetPassword.getPassword());
//			model.addAttribute(MESSAGE, passwordResetSuccessful);
//			log.info("password successfull"+resetPassword);
//			return SUCCESS_VIEW;
//		} else {
//			model.addAttribute(MESSAGE, unableToResetPwd);
//			return ERROR_VIEW;
//		}
//	}
//
//	@RequestMapping(value = "/home", method = RequestMethod.GET)
//	public String home(ModelMap model) {
//		return REDIRECT + "/";
//	}
//
//	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
//	public String accessDenied(ModelMap model) {
//		model.addAttribute(ERROR, "true");
//		return ACCESS_DENIED_VIEW;
//	}
//
//	@RequestMapping(value = "/logout", method = RequestMethod.GET)
//	public String logout(ModelMap model) {
//		// TODO: Write logic logout user effectively.
//		// TODO Move this to message.properties.
//		model.addAttribute(MESSAGE, "You are now logged out of the system.");
//		SecurityContextHolder.clearContext();
//		log.info("Log Out Successfully");
//		return LOGOUT_VIEW;
//	}
//	
//	@RequestMapping(value = "/help", method = RequestMethod.GET)
//	public String showHelp(ModelMap model) {
//		model.addAttribute("serverurl", userService.pictureUrl());
//		model.addAttribute(USER_INFO, getUserDetails().getUserAccount());
//		return HELP_VIEW;
//	}
//
//	@RequestMapping(value = "/logout/audit", method = RequestMethod.GET)
//	public String logoutAudit(ModelMap model) {
//		CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder
//				.getContext().getAuthentication().getPrincipal();
//		auditService.updateAuditLogByEntityId(
//				Constant.ENTITY_TYPE_USERACCOUNT,
//				"User",
//				AuditOperation.OPERATION_LOGOUT,
//				"User "
//						+ StringUtils.capitalize(userDetails.getUserAccount()
//								.getUserLastName())
//						+ " "
//						+ StringUtils.capitalize(userDetails.getUserAccount()
//								.getUserFirstName()) + " ["
//						+ userDetails.getUserAccount().getUserId() + "]"
//						+ " has " + AuditOperation.OPERATION_LOGOUT.getDesc(),
//				"", userDetails.getUserAccount(), new Date(), null);
//		return "Success";
//	}
	
}
