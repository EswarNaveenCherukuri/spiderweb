package com.spiderweb.vendor.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "contract_info")

public class contractInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contract_id; 
	private int vendor_id; 
	private int client_id; 
	private int candidate_id;  
	private String job_title; 
	private String job_skills; 
	private int rate_per_hour; 
	private String type_of_contract;  
	private int no_of_years;  
	private String contract_start_date; 
	private String contract_end_date;  
	private String project_start_date; 
	private String project_end_date; 
	private String status; 
	private String submitted_date; 
	private String submitted_by; 
	private String update_date; 
	private String update_by;
	public int getContract_id() {
		return contract_id;
	}
	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public int getCandidate_id() {
		return candidate_id;
	}
	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getJob_skills() {
		return job_skills;
	}
	public void setJob_skills(String job_skills) {
		this.job_skills = job_skills;
	}
	public int getRate_per_hour() {
		return rate_per_hour;
	}
	public void setRate_per_hour(int rate_per_hour) {
		this.rate_per_hour = rate_per_hour;
	}
	public String getType_of_contract() {
		return type_of_contract;
	}
	public void setType_of_contract(String type_of_contract) {
		this.type_of_contract = type_of_contract;
	}
	public int getNo_of_years() {
		return no_of_years;
	}
	public void setNo_of_years(int no_of_years) {
		this.no_of_years = no_of_years;
	}
	public String getContract_start_date() {
		return contract_start_date;
	}
	public void setContract_start_date(String contract_start_date) {
		this.contract_start_date = contract_start_date;
	}
	public String getContract_end_date() {
		return contract_end_date;
	}
	public void setContract_end_date(String contract_end_date) {
		this.contract_end_date = contract_end_date;
	}
	public String getProject_start_date() {
		return project_start_date;
	}
	public void setProject_start_date(String project_start_date) {
		this.project_start_date = project_start_date;
	}
	public String getProject_end_date() {
		return project_end_date;
	}
	public void setProject_end_date(String project_end_date) {
		this.project_end_date = project_end_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		return "contractInfo [contract_id=" + contract_id + ", vendor_id=" + vendor_id + ", client_id=" + client_id
				+ ", candidate_id=" + candidate_id + ", job_title=" + job_title + ", job_skills=" + job_skills
				+ ", rate_per_hour=" + rate_per_hour + ", type_of_contract=" + type_of_contract + ", no_of_years="
				+ no_of_years + ", contract_start_date=" + contract_start_date + ", contract_end_date="
				+ contract_end_date + ", project_start_date=" + project_start_date + ", project_end_date="
				+ project_end_date + ", status=" + status + ", submitted_date=" + submitted_date + ", submitted_by="
				+ submitted_by + ", update_date=" + update_date + ", update_by=" + update_by + "]";
	}
}
