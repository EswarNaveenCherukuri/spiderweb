package com.spiderweb.vendor.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "client_info")

public class client_info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int client_id;  
	private String client_name;  
	private int client_number;  
	private String client_city;  
	private String client_state;   
	private String client_zip_code; 
	private String client_country; 
	private String client_email_id; 
	private String client_contact_person;
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public int getClient_number() {
		return client_number;
	}
	public void setClient_number(int client_number) {
		this.client_number = client_number;
	}
	public String getClient_city() {
		return client_city;
	}
	public void setClient_city(String client_city) {
		this.client_city = client_city;
	}
	public String getClient_state() {
		return client_state;
	}
	public void setClient_state(String client_state) {
		this.client_state = client_state;
	}
	public String getClient_zip_code() {
		return client_zip_code;
	}
	public void setClient_zip_code(String client_zip_code) {
		this.client_zip_code = client_zip_code;
	}
	public String getClient_country() {
		return client_country;
	}
	public void setClient_country(String client_country) {
		this.client_country = client_country;
	}
	public String getClient_email_id() {
		return client_email_id;
	}
	public void setClient_email_id(String client_email_id) {
		this.client_email_id = client_email_id;
	}
	public String getClient_contact_person() {
		return client_contact_person;
	}
	public void setClient_contact_person(String client_contact_person) {
		this.client_contact_person = client_contact_person;
	}  
}
