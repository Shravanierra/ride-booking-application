/*
package com.ridebooking.ridebookingapplication.Controller;

import com.ridebooking.ridebookingapplication.Service.VehicleService;
import com.ridebooking.ridebookingapplication.Serviceimpl.VehicleServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @Autowired
    private VehicleService vehicleservice;

    @PostMapping("/ride-booking/checkavailability")
    public String checkAvailability(@RequestBody VehicleServiceimpl request) {
        boolean isAvailable = vehicleservice.checkAvailability(request.getType());
        if (isAvailable) {
            return "Vehicle available for booking.";
        } else {
            return "Vehicle not available at the moment.";
        }
    }
}*/

