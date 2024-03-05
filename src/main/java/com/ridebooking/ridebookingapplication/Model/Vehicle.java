package com.ridebooking.ridebookingapplication.Model;

public class Vehicle {
	
	private Long vehicleid;
	private String type;
	private Long basefare;
	private Long rateperkm;
	
	public Vehicle() {
		
	}
	
	public Vehicle(Long vehicleid, String type, Long basefare, Long rateperkm) {
		super();
		this.vehicleid = vehicleid;
		this.type = type;
		this.basefare = basefare;
		this.rateperkm = rateperkm;
	}
	public Long getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(Long vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getBasefare() {
		return basefare;
	}
	public void setBasefare(Long basefare) {
		this.basefare = basefare;
	}
	public Long getRateperkm() {
		return rateperkm;
	}
	public void setRateperkm(Long rateperkm) {
		this.rateperkm = rateperkm;
	}
	
	
	

}
