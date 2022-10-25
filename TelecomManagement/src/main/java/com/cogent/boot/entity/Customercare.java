package com.cogent.boot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customercare")
public class Customercare {
	
	@Id
	private long id;
	
	private String complaintDescription;
	private long user_id;
	private String statusOfComplaint;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getComplaintDescription() {
		return complaintDescription;
	}
	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getStatusOfComplaint() {
		return statusOfComplaint;
	}
	public void setStatusOfComplaint(String statusOfComplaint) {
		this.statusOfComplaint = statusOfComplaint;
	}
	@Override
	public String toString() {
		return "Customercare [id=" + id + ", complaintDescription=" + complaintDescription + ", user_id=" + user_id
				+ ", statusOfComplaint=" + statusOfComplaint + "]";
	}

}
