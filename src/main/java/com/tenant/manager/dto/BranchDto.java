package com.tenant.manager.dto;

/**
 * @author lore
 *
 */
public class BranchDto {

	private String bid;
	private String bname;
	private String hid;
	private int rooms;

	public BranchDto(String bid, String bname, String hid, int rooms) {
		this.bid = bid;
		this.bname = bname;
		this.hid = hid;
		this.rooms = rooms;
	}

	public BranchDto() {
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "BranchDto [bid=" + bid + ", bname=" + bname + ", hid=" + hid + ", rooms=" + rooms + "]";
	}

}
