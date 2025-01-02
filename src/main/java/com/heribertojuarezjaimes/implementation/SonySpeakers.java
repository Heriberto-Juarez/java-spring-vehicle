package com.heribertojuarezjaimes.implementation;

import com.heribertojuarezjaimes.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component(value = "sony")
public class SonySpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("Playing sound from sony speakers");
    }
}
