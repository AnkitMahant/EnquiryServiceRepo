package com.cjc.main.serviceI;

import com.cjc.main.model.EnquiryDetails;

public interface EnquiryServiceI {

public 	EnquiryDetails updateEnquiry(int enquiryId, EnquiryDetails enquiry);
public	EnquiryDetails saveEnquiry(EnquiryDetails enquiryDetails);

}
