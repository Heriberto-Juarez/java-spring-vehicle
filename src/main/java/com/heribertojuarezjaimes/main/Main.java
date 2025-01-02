package com.heribertojuarezjaimes.main;

import com.heribertojuarezjaimes.beans.Person;
import com.heribertojuarezjaimes.beans.Vehicle;
import com.heribertojuarezjaimes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var lucy = context.getBean(Person.class);

        var lucysVehicle = lucy.getVehicle();

        System.out.println("The person name is: " + lucy.getName());
        System.out.println("The person's vehicle name is: " + lucysVehicle.getName());


        // Actions

        var vehicleServices = lucysVehicle.getVehicleServices();

        vehicleServices.playMusic();
        vehicleServices.moveVehicle();
    }
}
