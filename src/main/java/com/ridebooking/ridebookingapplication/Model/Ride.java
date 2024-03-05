package com.ridebooking.ridebookingapplication.Model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Place")
public class Ride {
	
	@Id
	private Long id;
	private String source;
	private String dest;
	
	private BigDecimal distance;
	
	public Ride() {
		
	}

	public Ride(Long id, String source, String dest, BigDecimal distance) {
		super();
		this.id = id;
		this.source = source;
		this.dest = dest;
		this.distance = distance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public  BigDecimal getdistance() {
		return distance;
	}

	public void setBasefare( BigDecimal distance) {
		this.distance = distance;
	}
	
	
	

}
