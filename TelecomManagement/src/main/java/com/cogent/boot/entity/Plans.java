package com.cogent.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plans")
public class Plans {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String plan_name;
	private double cost;
	private String validity;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	
	@Override
	public String toString() {
		return "Plans [id=" + id + ", plan_name=" + plan_name + ", cost=" + cost + ", validity=" + validity + "]";
	}
	
	
	
}
