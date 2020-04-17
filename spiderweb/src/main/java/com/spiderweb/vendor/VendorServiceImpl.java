package com.spiderweb.vendor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spiderweb.vendor.jpa.ClientInfoRepository;
import com.spiderweb.vendor.jpa.ContractInfoRepository;
import com.spiderweb.vendor.jpa.InterviewInfoRepository;
import com.spiderweb.vendor.jpa.VendorInfoRepository;
import com.spiderweb.vendor.jpa.clientInfo;
import com.spiderweb.vendor.jpa.contractInfo;
import com.spiderweb.vendor.jpa.interviewInfo;
import com.spiderweb.vendor.jpa.vendorInfo;

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
	public List<vendorInfo> getVendorInfo() {
		return 	vendorInfoRepository.findAll();
		

	}
	@Override
	public List<contractInfo> getContractInfo() {
	return 	contractInfoRepository.findAll();
		
	}
	@Override
	public List<interviewInfo> getInterviewInfo() {
		return interviewInfoRepository.findAll();
		
	}
	@Override
	public List<clientInfo> getClientInfo() {
	return 	clientInfoRepository.findAll();
		
	}

}
