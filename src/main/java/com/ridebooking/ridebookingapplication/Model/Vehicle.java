package com.ridebooking.ridebookingapplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Vehicle {

    @Id
    private Long id;
    private String type;
    private boolean availability;
    public Vehicle() {
    }

    public Vehicle(Long id, String type, boolean availability) {
        this.id = id;
        this.type = type;
        this.availability = availability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
