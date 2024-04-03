package com.restapiDBdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.restapiDBdemo.entity.VendorDetails;
import com.restapiDBdemo.service.VendorService;

@RestController
@RequestMapping("/vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping("/vendors")
    public List<VendorDetails> getVendors() {
        return vendorService.getAllVendors();
    }

    @GetMapping("/vendors/{vendorId}")
    public VendorDetails getVendorDetailsById(@PathVariable("vendorId") int vendorId) {
        return vendorService.getVendorByID(vendorId);
    }

    @PostMapping("/vendors/create")
    public String createVendor(@RequestBody VendorDetails vendorDetails) {
        vendorService.createVendor(vendorDetails);
        return "Success... created a new vendor";
    }

    @PutMapping("/vendors/{vendorId}")
    public String updateVendor(@PathVariable("vendorId") int vendorId, @RequestBody VendorDetails vendorDetails) {
     
        vendorService.updateVendor(vendorDetails);
        return "Success... updated an existing vendor";
    }

    @DeleteMapping("/vendors/{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") int vendorId) {
        vendorService.deleteVendor(vendorId);
        return "Success... deleted";
    }
}
