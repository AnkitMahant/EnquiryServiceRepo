package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.EnquiryDetails;
import com.cjc.main.serviceI.EnquiryServiceI;

@RequestMapping("/enquiry")
@RestController
public class EnquiryController {

	@Autowired private EnquiryServiceI es;
	
	@PutMapping("/edit-enquiry/{enquiryId}")
	public ResponseEntity<EnquiryDetails> onEditEnquiry(@PathVariable int enquiryId, @RequestBody EnquiryDetails enquiry)
	
	{
		
		EnquiryDetails enquiryRef  =es.updateEnquiry(enquiryId,enquiry);
		return new ResponseEntity<EnquiryDetails>(enquiryRef,HttpStatus.OK);
	}
	
	
	
	
	
}
