package com.cjc.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.constant.ExceptionMessageConstant;
import com.cjc.main.exceptions.EnquiryNotFoundException;
import com.cjc.main.model.EnquiryDetails;
import com.cjc.main.repository.EnquiryRepository;
import com.cjc.main.serviceI.EnquiryServiceI;
@Service
public class EnquiryServiceImpl  implements EnquiryServiceI
{
	
	@Autowired private EnquiryRepository er;

	@Override
	public EnquiryDetails updateEnquiry(int enquiryId, EnquiryDetails enquiry) {
		
	 Optional<EnquiryDetails>  opEnquiry	=er.findById(enquiryId);
	if(opEnquiry.isPresent())
	{
		
	return er.save(enquiry);
	
	}
	
	else {
		
		throw new EnquiryNotFoundException(ExceptionMessageConstant.ENQUIRY_NOT_FOUND +enquiryId);
	}
	 
	}
	
	

}
