package com.ridebooking.ridebookingapplication.Service;

import org.springframework.stereotype.Service;

import com.ridebooking.ridebookingapplication.Model.Ride;

@Service
public interface RideService {

	public Ride create(Ride place);
	

}
