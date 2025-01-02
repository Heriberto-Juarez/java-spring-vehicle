package com.heribertojuarezjaimes.services;

import com.heribertojuarezjaimes.interfaces.Speakers;
import com.heribertojuarezjaimes.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    private Tyres tyres;

    public Speakers getSpeakers() {
        return speakers;
    }

    @Autowired
    public void setSpeakers(@Qualifier("bose") Speakers speakers) {
        this.speakers = speakers;
    }

    private Speakers speakers;

    public void playMusic(){
        speakers.makeSound();
    }

    public void moveVehicle(){
        tyres.rotate();
    }

}
