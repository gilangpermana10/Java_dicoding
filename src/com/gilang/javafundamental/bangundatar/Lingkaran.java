package com.gilang.javafundamental.bangundatar;

public class Lingkaran implements BangunDatar{

    private final double pi = 3.1415;

    Lingkaran(){

    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }


    //metode overload
    public double luas(int r){
        return (pi *r *r);
    }

    //,etode overload
    public double keliling(int r){
        return (2 * pi * r);
    }
}
