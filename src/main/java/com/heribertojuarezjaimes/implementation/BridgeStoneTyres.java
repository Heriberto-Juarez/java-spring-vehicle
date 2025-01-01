package com.heribertojuarezjaimes.implementation;

import com.heribertojuarezjaimes.interfaces.Tyres;

public class BridgeStoneTyres implements Tyres {

    @Override
    public void rotate() {
        System.out.println("Rotating bridgestone tyres");
    }
}
