package com.spiderweb.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spiderweb.vendor.jpa.ClientInfoRepository;
import com.spiderweb.vendor.jpa.ContractInfoRepository;
import com.spiderweb.vendor.jpa.InterviewInfoRepository;
import com.spiderweb.vendor.jpa.VendorInfoRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private ClientInfoRepository clientInfoRepository;
	
	@Autowired
	private ContractInfoRepository contractInfoRepository ;
	
	@Autowired
	private InterviewInfoRepository interviewInfoRepository;
	
	@Autowired
	private VendorInfoRepository vendorInfoRepository;
	
	@Override
	public void getVendorInfo() {
		vendorInfoRepository.findAll();
		
	}
	@Override
	public void getClientInfo() {
		clientInfoRepository.findAll();
		
	}
	@Override
	public void getContractInfo() {
		contractInfoRepository.findAll();
		
	}
	@Override
	public void getInterviewInfo() {
		interviewInfoRepository.findAll();
		
	}

}
