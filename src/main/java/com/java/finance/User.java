package com.java.finance;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="newuser" , schema = "public")
public class User {
	
	@Id
	@NotNull
	@GeneratedValue
	@Column(name="serielnumber")
	private int sno;
	
	public int getS_no() {
		return sno;
	}
	public void setS_no(int sno) {
		this.sno = sno;
	}
	@Column(name="Names")
	private String name;
	
	@Column(name="GivenAmount")
	private double given_amount;
	
	@Column(name="TakenAmount")
	private double taken_amount;
	
	@Column(name="TotalAmount")
	private double total_amount;
	
	@Column(name="city")
	private String city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="Date")
	private Date date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGiven_amount() {
		return given_amount;
	}
	public void setGiven_amount(double given_amount) {
		this.given_amount = given_amount;
	}
	public double getTaken_amount() {
		return taken_amount;
	}
	public void setTaken_amount(double taken_amount) {
		this.taken_amount = taken_amount;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User(int sno, String name, double given_amount, double taken_amount, double total_amount, String city, Date date) {
		super();
		this.sno = sno;
		this.name = name;
		this.given_amount = given_amount;
		this.taken_amount = taken_amount;
		this.total_amount = total_amount;
		this.city = city;
		this.date = date;
	}
	public User() {
		super();
	}
	
	

}
