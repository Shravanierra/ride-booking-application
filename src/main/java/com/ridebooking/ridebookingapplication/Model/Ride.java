package com.ridebooking.ridebookingapplication.Model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Ride {

	@Id
	private Long id;
	private String area;
	private String vehicleType;
	private BigDecimal distance;

	public Ride() {
	}

	public Ride(Long id, String area,String vehicleType, BigDecimal distance) {
		this.id = id;
		this.area = area;
		this.vehicleType=vehicleType;
		this.distance = distance;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public BigDecimal getDistance() {
		return distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
}

