package com.gilang.javafundamental.function;

public class InputFunction {
    public static void main(String[] args) {
        hitungluas(10,5);
    }

    public static void hitungluas(double panjang, double lebar){
        double luas;
        luas = panjang * lebar;
        System.out.println("hasilnya adalah : "+ luas);
    }
}
