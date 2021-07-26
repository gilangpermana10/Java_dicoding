package com.gilang.javafundamental.accessmodifier.package3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);

        for (int i=0;i<5;i++){
            new Perhitungan();
        }

        System.out.println("Sampai " + Perhitungan.nilai);
        System.out.println("getNilai Memiliki nilai : " + Perhitungan.getNilai());
    }

}
