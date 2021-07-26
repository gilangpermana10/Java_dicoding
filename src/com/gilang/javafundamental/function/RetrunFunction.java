package com.gilang.javafundamental.function;

public class RetrunFunction {
    public static void main(String[] args) {
        double p= 10;
        double l = 5;
        double hasil = hitungluas(p,l);
        System.out.println("Hasilnya adalah : " + hasil);
    }

    public static double hitungluas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }
}
