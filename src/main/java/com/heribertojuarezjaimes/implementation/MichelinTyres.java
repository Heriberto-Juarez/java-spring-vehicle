package com.heribertojuarezjaimes.implementation;

import com.heribertojuarezjaimes.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "michelin")
@Primary
public class MichelinTyres implements Tyres {
    @Override
    public void rotate(){
        System.out.println("Rotating Michelin tyres");
    }
}