package com.restapiDBdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vendor_info")
public class VendorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="vendor_name")
	private String name;
	@Column(name="vendor_address")
    private String address;
	@Column(name="vendor_phonenumber")
    private String phoneNumber;
	@Column(name="vendor_email")
    private String email;

    // Constructors, getters, and setters
    public VendorDetails() {}

    public VendorDetails(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and setters
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
