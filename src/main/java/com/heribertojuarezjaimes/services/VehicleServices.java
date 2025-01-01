package com.heribertojuarezjaimes.services;

import com.heribertojuarezjaimes.interfaces.Speakers;
import com.heribertojuarezjaimes.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Tyres tyres;

    public Speakers getSpeakers() {
        return speakers;
    }

    @Autowired
    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Speakers speakers;

    public void playMusic(){
        speakers.makeSound();
    }

    public void moveVehicle(){
        tyres.rotate();
    }

}
