package com.tenant.manager.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tenant")
public class Tenant implements Serializable {

	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "autoId")
//	private int autoId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "name")
	private String name;

	@Column(name = "gov_id")
	private String gov_id;

	@Column(name = "doj")
	private Date doj;

	@Column(name = "address")
	private String address;

	@Column(name = "room")
	private String room;

	@Column(name = "amount")
	private int amount;

	@Column(name = "email")
	private String email;

	@Column(name = "bid")
	private String bId;

//	@Column(name = "dov")
//	private Date dov;

	/*
	 * public int getAutoId() { return autoId; }
	 * 
	 * public void setAutoId(int autoId) { this.autoId = autoId; }
	 */

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGov_Id() {
		return gov_id;
	}

	public void setGov_Id(String id) {
		this.gov_id = id;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

//	public Date getDov() {
//		return dov;
//	}
//
//	public void setDov(Date dov) {
//		this.dov = dov;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", mobile=" + mobile + ", name=" + name + ", id=" + gov_id + ", doj=" + doj
				+ ", address=" + address + ", room=" + room + ", amount=" + amount + ", email=" + email + ", bId=" + bId
				+ "]";
	}
}
