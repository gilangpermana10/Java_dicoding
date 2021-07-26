package com.gilang.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lo = new ArrayList(); // List tanpa parameter
        //lo.add("lo  - String 1"); //lo menampung objek String
        lo.add(new Planet("mercury", 0.06)); //lo menampung planet

        for (Object o : lo){
            Planet p = (Planet) o; //Perlu type-casting dari object ke planet
            p.print();
        }

        List<Planet> lp = new ArrayList<>(); //List dengan type-parameter Planet
        lp.add(new Planet("Mercury", 0.06)); // lp menampung objek planet
        //lp.add("lp - String 1"); //baris ini compile error, lp tidak diijinkan menampung objek string
        lp.add(new Planet("venus", 0.82));

        for (Planet p : lp){
            p.print();
        }

    }

}
