package com.gilang.javafundamental.function;

public class MethodOverloading {
    public static void main(String[] args) {
        double p=7, l =6.5;
        double hasil = hitungluas(p,l);
        System.out.println("luas dalam double : " + hasil);

        int pn = 7, ln = 6;
        int hasil2 = hitungluas(pn,ln);
        System.out.println("Hasil dalam Integer : " + hasil2);
    }

    public static double hitungluas(double panjang, double lebar){
        double luas;
        luas = panjang  * lebar;
        return luas;
    }

    public static int hitungluas(int panjang, int lebar){
        int luas;
        luas = panjang * lebar;
        return luas;
    }
}
