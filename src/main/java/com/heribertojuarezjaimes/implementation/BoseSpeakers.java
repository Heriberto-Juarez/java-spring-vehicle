package com.heribertojuarezjaimes.implementation;

import com.heribertojuarezjaimes.interfaces.Speakers;

public class BoseSpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("Playing sound from Bose speakers");
    }
}
