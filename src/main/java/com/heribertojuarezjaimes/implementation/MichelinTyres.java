package com.heribertojuarezjaimes.implementation;

import com.heribertojuarezjaimes.interfaces.Tyres;

public class MichelinTyres implements Tyres {
    @Override
    public void rotate(){
        System.out.println("Rotating Michelin tyres");
    }
}
