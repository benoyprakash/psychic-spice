package com.classifieds.controller;

import static com.classifieds.utils.Constants.USER_DATA;
import static com.classifieds.utils.Views.HOME_APP_SEARCH_RESULT_VIEW;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.classifieds.repository.PostRepository;
import com.classifieds.service.HomeApplianceService;
import com.classifieds.service.UtilityServices;
import com.classifieds.utils.ReferenceConstants;
import com.classifieds.utils.ReferenceConstants.CategoryList;
import com.classifieds.web.model.HomeNeedsLeftMenuInfo;

@Controller
public class HomeApplianceController extends BaseController{

	private static Logger logger = LoggerFactory
			.getLogger(HomeApplianceController.class);
	
	@Autowired
	private HomeApplianceService homeAppService;

	@RequestMapping(value = "/homeAppliance", method = RequestMethod.GET)
	public ModelAndView getHomeAppliance(HttpServletRequest request, @RequestParam(value = "subId", required = false) Integer subId) {
		logger.info("getHomeAppliance() requested by : "
				+ UtilityServices.getIpAddress(request));
		categoryLog(logger, "HomeAppliance",subId);
		Map<String, Object> mMap = new HashMap<String, Object>();
		
		mMap.put("searchResultList", homeAppService.fetchHomeApplianceResultforSubId(subId));
		mMap.put("categoryList", CategoryList.getKeyValueMap());
		mMap.put("subCategoryList", ReferenceConstants.HomeNeedsCategory.getAllCodes());
		mMap.put("homeNeedLeftMenu", new HomeNeedsLeftMenuInfo());
		mMap.put("selectSarchCriterias", "Refine your search using the criterias shown on the left side.");	
		logger.info("End of getHome() function.");
		return new ModelAndView(HOME_APP_SEARCH_RESULT_VIEW, mMap);
	}
	
	@RequestMapping(value = "/homeAppliance/refine", method = RequestMethod.POST)
	public ModelAndView searchWithLeftMenu(HttpServletRequest request, @ModelAttribute("homeNeedLeftMenu") HomeNeedsLeftMenuInfo leftMenuInfo){
		Map<String, Object> mMap = new HashMap<String, Object>();
		
		return new ModelAndView(HOME_APP_SEARCH_RESULT_VIEW, mMap);
	}
}
