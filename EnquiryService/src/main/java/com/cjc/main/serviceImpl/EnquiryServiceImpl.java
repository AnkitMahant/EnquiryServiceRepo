package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.EnquiryDetails;
import com.cjc.main.repository.EnquiryRepository;
import com.cjc.main.serviceI.EnquiryServiceI;
@Service
public class EnquiryServiceImpl  implements EnquiryServiceI
{

	@Autowired private EnquiryRepository enquiryRepository;
	
	
	@Override
	public EnquiryDetails saveEnquiry(EnquiryDetails enquiryDetails) {
		
		return enquiryRepository.save(enquiryDetails);
	}
	
	

}
