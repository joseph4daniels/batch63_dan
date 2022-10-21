package com.cogent.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payroll")
public class Payroll {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	private long amount;
	private long daysWorked;
	private long taxpaid;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getDaysWorked() {
		return daysWorked;
	}
	public void setDaysWorked(long daysWorked) {
		this.daysWorked = daysWorked;
	}
	public long getTaxpaid() {
		return taxpaid;
	}
	public void setTaxpaid(long taxpaid) {
		this.taxpaid = taxpaid;
	}
	
	@Override
	public String toString() {
		return "Payroll [id=" + id + ", name=" + name + ", amount=" + amount + ", daysWorked=" + daysWorked
				+ ", taxpaid=" + taxpaid + "]";
	}
	
	

}
