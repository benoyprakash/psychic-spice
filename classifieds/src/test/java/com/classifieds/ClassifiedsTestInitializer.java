package com.classifieds;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.classifieds.base.ApplicationConfiguration;

//@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = ApplicationConfiguration.class)
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class ClassifiedsTestInitializer {

	private static Logger logger = LoggerFactory
			.getLogger(ClassifiedsTestInitializer.class);

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;

	@BeforeClass
	public static void runBeforeClass() {
		logger.info("Initializing and running Test cases");
	}

	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@After
	public void tearDown() {

	}

	@AfterClass
	public static void runAfterClass() {
		logger.info("Finished running Test cases");
	}

	public MockMvc getMockMvc() {
		return mockMvc;
	}

	public void setMockMvc(MockMvc mockMvc) {
		this.mockMvc = mockMvc;
	}

	public WebApplicationContext getWac() {
		return wac;
	}

	public void setWac(WebApplicationContext wac) {
		this.wac = wac;
	}

}
