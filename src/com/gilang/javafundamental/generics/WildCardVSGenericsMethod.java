package com.gilang.javafundamental.generics;

import java.util.Collection;
import java.util.ArrayList;

public class WildCardVSGenericsMethod {
    //menggunakan wildcards
    static void print(Collection<?> col){
        for (Object o : col){
            System.out.print(o);
        }
    }

    //Menggunakan Generics method
    static <T> Collection arrayToCollection(T[] a){
        Collection<T> c = new ArrayList();
        for (T o : a){
            c.add(o);
        }
        return c;
    }

    public static void main(String[] args) {
        String[] sa = {"Happy", "Coding"};
        Collection r = arrayToCollection(sa);
        print(r);
    }
}
