package com.tenant.manager.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class TenantDto {

	private int id;
	private String mobile;
	private String name;
	private String gov_id;
	private Date doj;
	private String address;
	private String room;
	private int amount;
	private String email;
	private String bId;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGov_id() {
		return gov_id;
	}

	public void setGov_id(String gov_id) {
		this.gov_id = gov_id;
	}

	@Override
	public String toString() {
		return "TenantDto [id=" + id + ", mobile=" + mobile + ", name=" + name + ", gov_id=" + gov_id + ", doj=" + doj
				+ ", address=" + address + ", room=" + room + ", amount=" + amount + ", email=" + email + ", bId=" + bId
				+ "]";
	}
	
	

}
