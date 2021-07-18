package com.gilang.javafundamental.collection;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPlanet {

    public static void main(String[] args) {
        String[] heroes = new String[2];
        heroes[0] = "gilang";
        heroes[1] = "permana";

        //ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("merkurius");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planets awal");
        for(int i = 0; i< planets.size(); i++){
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        planets.remove("venus");

        System.out.println("List planet akhir : ");
        for(int i=0; i < planets.size(); i++){
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
    }

}
