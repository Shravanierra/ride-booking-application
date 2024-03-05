package com.ridebooking.ridebookingapplication.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ridebooking.ridebookingapplication.Model.Ride;
import com.ridebooking.ridebookingapplication.Repository.placeRepository;
import com.ridebooking.ridebookingapplication.Service.RideService;


@Service
public class RideServiceimpl implements RideService{
	
	@Autowired
	placeRepository placerepo;

	@Override
	public Ride create(Ride place) {
		// TODO Auto-generated method stub
		return placerepo.save(place);
	}
	
	
}
