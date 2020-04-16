package com.spiderweb.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class VendorController {
	
	@Autowired
	private VendorService vendorService;
	
	@GetMapping("/vendorinfo")
	public void getVendorinfo() {
		vendorService.getVendorInfo();
	}
	@GetMapping("/contractinfo")
	public void getContractinfo() {
		vendorService.getVendorInfo();
	}
	@GetMapping("/interviewinfo")
	public void getInterviewinfo() {
		vendorService.getVendorInfo();
	}
	@GetMapping("/clientinfo")
	public void getClientinfo() {
		vendorService.getVendorInfo();
	}
	
	
	

}
