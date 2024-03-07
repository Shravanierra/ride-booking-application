
/*package com.ridebooking.ridebookingapplication.Service;

import com.ridebooking.ridebookingapplication.Model.Vehicle;
import com.ridebooking.ridebookingapplication.Repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private VehicleRepository vehicleRepository;
    public boolean checkAvailability(String vehicleType) {

        List<Vehicle> availableVehicles = vehicleRepository.findByTypeAndAvailability(vehicleType, true);
        return !availableVehicles.isEmpty();
    }
}*/
