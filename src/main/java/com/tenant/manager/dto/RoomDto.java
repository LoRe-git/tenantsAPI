package com.tenant.manager.dto;

import javax.persistence.Column;

public class RoomDto {
	private String roomId;
	private String roomNo;
	private String branchId;
	private int cost;
	private int capacity;

	public RoomDto(String roomId, String roomNo, String branchId, int cost, int capacity) {
		this.roomId = roomId;
		this.roomNo = roomNo;
		this.branchId = branchId;
		this.cost = cost;
		this.capacity = capacity;
	}

	public RoomDto() {
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
