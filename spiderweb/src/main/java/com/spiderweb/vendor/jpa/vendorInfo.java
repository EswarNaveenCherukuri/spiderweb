package com.spiderweb.vendor.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name= "vendor_info")

public class vendorInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendor_id;
	private String vendor_name;
	private int vendor_number; 
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public int getVendor_number() {
		return vendor_number;
	}
	public void setVendor_number(int vendor_number) {
		this.vendor_number = vendor_number;
	}
	public String getVendor_city() {
		return vendor_city;
	}
	public void setVendor_city(String vendor_city) {
		this.vendor_city = vendor_city;
	}
	public String getVendor_state() {
		return vendor_state;
	}
	public void setVendor_state(String vendor_state) {
		this.vendor_state = vendor_state;
	}
	public String getVendor_zip_code() {
		return vendor_zip_code;
	}
	public void setVendor_zip_code(String vendor_zip_code) {
		this.vendor_zip_code = vendor_zip_code;
	}
	public String getVendor_country() {
		return vendor_country;
	}
	public void setVendor_country(String vendor_country) {
		this.vendor_country = vendor_country;
	}
	public String getVendor_email_id() {
		return vendor_email_id;
	}
	public void setVendor_email_id(String vendor_email_id) {
		this.vendor_email_id = vendor_email_id;
	}
	public String getVendor_contact_person() {
		return vendor_contact_person;
	}
	public void setVendor_contact_person(String vendor_contact_person) {
		this.vendor_contact_person = vendor_contact_person;
	}
	private String vendor_city; 
	private String vendor_state;  
	private String vendor_zip_code;  
	private String vendor_country; 
	private String vendor_email_id;
	private String vendor_contact_person; 
}
