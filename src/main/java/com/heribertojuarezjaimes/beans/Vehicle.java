package com.heribertojuarezjaimes.beans;

import com.heribertojuarezjaimes.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Lamborghini Urus";

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices){
        this.vehicleServices = vehicleServices;
    }

}
