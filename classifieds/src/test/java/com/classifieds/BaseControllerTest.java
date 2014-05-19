package com.classifieds;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseControllerTest {

	@Autowired
	private BaseController basaController;
	
	@Test
	public void getHomeTest(){
		basaController.getHome();
	}

}
