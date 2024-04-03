package com.restapiDBdemo.service;

import java.util.List;

import com.restapiDBdemo.entity.VendorDetails;

public interface VendorService {
	
	public List<VendorDetails> getAllVendors();
	
	public  String createVendor(VendorDetails vendorDetails);
	
	public  String updateVendor(VendorDetails vendorDetails);
	
	public  String deleteVendor(int vendorID);
	
	public  VendorDetails getVendorByID(int vendorID);
}
