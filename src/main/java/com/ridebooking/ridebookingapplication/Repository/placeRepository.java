package com.ridebooking.ridebookingapplication.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ridebooking.ridebookingapplication.Model.Ride;


public interface placeRepository extends JpaRepository<Ride,Integer> {
	
	

}
