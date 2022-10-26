package com.cogent.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="celebration")
public class Celebration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	private double budget;
	private int countppl;
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
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public int getCountppl() {
		return countppl;
	}
	public void setCountppl(int countppl) {
		this.countppl = countppl;
	}
	@Override
	public String toString() {
		return "Celebration [id=" + id + ", name=" + name + ", budget=" + budget + ", countppl=" + countppl + "]";
	}
	
	
}
