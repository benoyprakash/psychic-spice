package com.classifieds;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.classifieds.controller.DocumentController;
import com.classifieds.service.DocumentService;


public class DocumentControllerTest extends ClassifiedsTestInitializer{

	@Autowired
	private DocumentController documentController;
	
	@Autowired
	private DocumentService documentService;
	
	@Test
	public void getFileTest(){
		
		String filePath = "F:\\fileTest\\";
		String fileName = "1.txt";
				
		documentController.getFile(filePath, fileName);
		
	}
}
