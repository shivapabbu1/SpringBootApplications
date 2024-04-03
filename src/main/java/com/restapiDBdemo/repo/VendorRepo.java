package com.restapiDBdemo.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.restapiDBdemo.entity.VendorDetails;


public interface VendorRepo extends JpaRepository<VendorDetails, Integer> {

}
