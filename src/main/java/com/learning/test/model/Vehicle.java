package com.learning.test.model;

import java.util.Date;

public class Vehicle {
	private int id;
	private String vehicleType;
	private String vehicleName;
	private int vehicleCost;
	private String createdBy;
	private String createdAt;
	
	public String toString() {
		// TODO Auto-generated method stub
		return "id=" + id + ", Vehicle name=" + vehicleName + ", Vehicle Type=" + vehicleType + ", Vehicle Cost=" + vehicleCost
				+ ", created by=" + createdBy + ", created at=" + createdAt;
		// return super.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getVehicleCost() {
		return vehicleCost;
	}

	public void setVehicleCost(int vehicleCost) {
		this.vehicleCost = vehicleCost;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date date) {
		this.createdAt = date.toString();
	}

	

}
