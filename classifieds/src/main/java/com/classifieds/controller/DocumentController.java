package com.classifieds.controller;

import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.classifieds.service.DocumentService;

@Controller
public class DocumentController {
	
	@Autowired
	private DocumentService documentService;

	private Logger logger = LoggerFactory.getLogger(DocumentController.class);
	@RequestMapping(value = "/doc/image/{filePath}", method = RequestMethod.GET)
	public ResponseEntity<FileSystemResource> getFile(
			@PathVariable("filePath") String filePath, @RequestParam("fileName") String fileName) {
		ResponseEntity<FileSystemResource> responseEntity = documentService.getFile(filePath, fileName);
		
		logger.info("accessing location : " + System.getProperties());

		return responseEntity;
	}
	
//	@RequestMapping(value = "/document/image/{fileName}", method = RequestMethod.GET)
//	public void getFile(
//	    @PathVariable("fileName") String fileName, 
//	    HttpServletResponse response) {
//	    try {
//	      // get your file as InputStream
//	      InputStream is = ...;
//	      // copy it to response's OutputStream
//	      IOUtils.copy(is, response.getOutputStream());
//	      response.flushBuffer();
//	    } catch (IOException ex) {
//	      log.info("Error writing file to output stream. Filename was '" + fileName + "'");
//	      throw new RuntimeException("IOError writing file to output stream");
//	    }
//
//	}
}
