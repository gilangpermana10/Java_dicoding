package com.gilang.javafundamental.generics;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("String 1");
        ls.add("String 2");

        print(ls); //Apakah ini valid

        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("venus", 0.82));

        print(cp);
    }

    public static void print(Collection<?> col){
        for (Object o : col){
            System.out.println(o);
        }

    }
}
