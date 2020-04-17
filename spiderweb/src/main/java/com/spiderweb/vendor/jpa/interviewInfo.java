package com.spiderweb.vendor.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "interview_info")

public class interviewInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int inteview_id; 
	private int contract_id; 
	private String interview_datetime; 
	private String interview_zone; 
	private String interview_location; 
	private String interview_type;
	private String interview_status; 
	private String submitted_date; 
	private String submitted_by; 
	private String update_date;
	private String update_by;
	
	public int getInteview_id() {
		return inteview_id;
	}
	public void setInteview_id(int inteview_id) {
		this.inteview_id = inteview_id;
	}
	public int getContract_id() {
		return contract_id;
	}
	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}
	public String getInterview_datetime() {
		return interview_datetime;
	}
	public void setInterview_datetime(String interview_datetime) {
		this.interview_datetime = interview_datetime;
	}
	public String getInterview_zone() {
		return interview_zone;
	}
	public void setInterview_zone(String interview_zone) {
		this.interview_zone = interview_zone;
	}
	public String getInterview_location() {
		return interview_location;
	}
	public void setInterview_location(String interview_location) {
		this.interview_location = interview_location;
	}
	public String getInterview_type() {
		return interview_type;
	}
	public void setInterview_type(String interview_type) {
		this.interview_type = interview_type;
	}
	public String getInterview_status() {
		return interview_status;
	}
	public void setInterview_status(String interview_status) {
		this.interview_status = interview_status;
	}
	public String getSubmitted_date() {
		return submitted_date;
	}
	public void setSubmitted_date(String submitted_date) {
		this.submitted_date = submitted_date;
	}
	public String getSubmitted_by() {
		return submitted_by;
	}
	public void setSubmitted_by(String submitted_by) {
		this.submitted_by = submitted_by;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	@Override
	public String toString() {
		return "interviewInfo [inteview_id=" + inteview_id + ", contract_id=" + contract_id + ", interview_datetime="
				+ interview_datetime + ", interview_zone=" + interview_zone + ", interview_location="
				+ interview_location + ", interview_type=" + interview_type + ", interview_status=" + interview_status
				+ ", submitted_date=" + submitted_date + ", submitted_by=" + submitted_by + ", update_date="
				+ update_date + ", update_by=" + update_by + "]";
	}
	
}
