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
	
	@GetMapping("/ride-booking/source/{source}/dest/{dest}")
	public Ride retrieveRides(
			@PathVariable String source,
			@PathVariable String dest) {
		return new Ride(10L,source,dest,BigDecimal.valueOf(10));
		
	}
	@PostMapping("/ride-booking/create")
	public Ride saveplace(@RequestBody Ride place) {
		return rideservice.create(place);
	}

}
