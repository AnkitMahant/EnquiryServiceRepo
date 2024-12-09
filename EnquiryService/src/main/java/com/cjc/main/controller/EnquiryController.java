package com.cjc.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import java.net.http.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.main.model.EnquiryDetails;
import com.cjc.main.serviceI.EnquiryServiceI;

@RequestMapping("/enquiry")
@RestController
public class EnquiryController {
	
	

	@Autowired private EnquiryServiceI enquiryService;
		
	@PostMapping("/save-enquiry")
	public ResponseEntity<EnquiryDetails>onSaveEnquiry(@RequestBody EnquiryDetails enquiryDetails)
	{

		EnquiryDetails enquiryDetailsRef=enquiryService.saveEnquiry(enquiryDetails);
		return new ResponseEntity<EnquiryDetails>(enquiryDetailsRef,HttpStatus.CREATED);
		

	}
	
	@PutMapping("/edit-enquiry/{enquiryId}")
	public ResponseEntity<EnquiryDetails> onEditEnquiry(@PathVariable int enquiryId, @RequestBody EnquiryDetails enquiry)
	
	{
		
		EnquiryDetails enquiryRef  =enquiryService.updateEnquiry(enquiryId,enquiry);
		return new ResponseEntity<EnquiryDetails>(enquiryRef,HttpStatus.OK);
	}
	
	
}


