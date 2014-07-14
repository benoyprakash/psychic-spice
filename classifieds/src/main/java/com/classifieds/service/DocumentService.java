package com.classifieds.service;

import java.io.File;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

	public ResponseEntity<FileSystemResource> getFile(String filePath, String fileName) {
		FileSystemResource resource = new FileSystemResource(new File(
				filePath, fileName));
		ResponseEntity<FileSystemResource> responseEntity = new ResponseEntity<FileSystemResource>(
				resource, HttpStatus.OK);
		
		return responseEntity;
	}

}
