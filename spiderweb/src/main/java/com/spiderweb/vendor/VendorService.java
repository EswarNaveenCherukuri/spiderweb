package com.spiderweb.vendor;

import org.springframework.stereotype.Service;

@Service
public interface  VendorService {

	void getVendorInfo();
	void getClientInfo();
	void getContractInfo();
	void getInterviewInfo();
}
