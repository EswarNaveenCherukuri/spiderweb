package com.spiderweb.vendor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spiderweb.vendor.jpa.clientInfo;
import com.spiderweb.vendor.jpa.contractInfo;
import com.spiderweb.vendor.jpa.interviewInfo;
import com.spiderweb.vendor.jpa.vendorInfo;

@Service
public interface  VendorService {

	 List<vendorInfo> getVendorInfo();
	 List<contractInfo>  getContractInfo();
	 List<interviewInfo>  getInterviewInfo();
	 List<clientInfo>  getClientInfo();
}
