package com.spiderweb.vendor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.spiderweb.vendor.jpa.clientInfo;
import com.spiderweb.vendor.jpa.contractInfo;
import com.spiderweb.vendor.jpa.interviewInfo;
import com.spiderweb.vendor.jpa.vendorInfo;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class VendorController {
	
	@Autowired
	private VendorServiceImpl vendorService;
	
	@GetMapping("/vendorinfo")
	public List<vendorInfo> getVendorinfo() {
		//vendorService.getVendorInfo();
       
			return   vendorService.getVendorInfo();
	}
	@GetMapping("/contractinfo")
	public List<contractInfo> getContractinfo() {
		 return vendorService.getContractInfo();
	}
	@GetMapping("/interviewinfo")
	public List<interviewInfo> getInterviewinfo() {
		return vendorService.getInterviewInfo();
	}
	@GetMapping("/clientinfo")
	public List<clientInfo> getClientinfo() {
		return vendorService.getClientInfo();
	}
	
	
	

}
