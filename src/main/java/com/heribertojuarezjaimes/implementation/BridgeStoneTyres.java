package com.heribertojuarezjaimes.implementation;

import com.heribertojuarezjaimes.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component(value = "bridgestone")
public class BridgeStoneTyres implements Tyres {

    @Override
    public void rotate() {
        System.out.println("Rotating bridgestone tyres");
    }
}
