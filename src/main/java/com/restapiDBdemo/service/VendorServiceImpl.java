package com.restapiDBdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restapiDBdemo.entity.VendorDetails;
import com.restapiDBdemo.repo.VendorRepo;
@Service
public class VendorServiceImpl implements VendorService {
	
	private VendorRepo vendorRepo;

	
	public VendorServiceImpl(VendorRepo vendorRepo) {
		super();
		this.vendorRepo = vendorRepo;
	}

	@Override
	public List<VendorDetails> getAllVendors() {
		
		return  vendorRepo.findAll();
	}

	@Override
	public String createVendor(VendorDetails vendorDetails) {
	
		 vendorRepo.save(vendorDetails);
		 return " Sucess...created a new vemdor";
	}

	@Override
	public String updateVendor(VendorDetails vendorDetails) {
	     vendorRepo.save(vendorDetails);
		return "suess...updated a existed vendor";
	}

	

	@Override
	public VendorDetails getVendorByID(int vendorID) {
		
		return vendorRepo.findById(vendorID).get();
	}

	@Override
	public String deleteVendor(int vendorID) {
		vendorRepo.deleteById(vendorID);
		return "sucess..dleted";
	}

}
