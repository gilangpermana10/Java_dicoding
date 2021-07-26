package com.gilang.javafundamental.accessmodifier.package2;

import com.gilang.javafundamental.accessmodifier.package1.KelasA;

public class kelasB extends KelasA{

    @Override
    protected void methodC(){
        super.methodC();

        System.out.println("Contoh pemanggilan protected dari package luar");
    }

}
