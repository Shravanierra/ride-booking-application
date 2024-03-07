package com.ridebooking.ridebookingapplication.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ridebooking.ridebookingapplication.Model.Ride;
import com.ridebooking.ridebookingapplication.Service.RideService;

@RestController
public class RideController {
	
	@Autowired
	RideService rideservice;
	
	@GetMapping("/ride-booking/area/{area}/vehicleType/{vehicleType}/distance/{distance}")
	public Ride retrieveRides(
			@PathVariable String area,
			@PathVariable String vehicleType,
			@PathVariable BigDecimal distance) {
		return new Ride(10L,area,vehicleType,distance);
		
	}
	@PostMapping("/ride-booking/create")
	public Ride saveuser(@RequestBody Ride user) {
		return rideservice.create(user);
	}

}
