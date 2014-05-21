package com.classifieds;

import org.junit.Test;

public class BaseControllerTest {

	// @Autowired
	// private BaseController basaController;
	//
	// @Autowired
	// private WebApplicationContext wac;
	//
	// private MockMvc mockMvc;

	@Test
	public void getHomeTest() {
		BaseController bc = new BaseController();
		bc.getHome();
	}

}
