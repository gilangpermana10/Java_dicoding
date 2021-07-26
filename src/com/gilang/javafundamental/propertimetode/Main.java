package com.gilang.javafundamental.propertimetode;

public class Main {
    public static void main(String[] args) {
        //kita tambahkan 1 argumen dengan nilai int 2
        //nilai tersebut adalah nilai yang digunakan untuk inisialisasi variabel umur

        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.lari();
        kucing.jalan();

        //contoh penggunaan fungsi getUmur
        System.out.println("umur hewan adalah " + kucing.getUmur());

        //perhitungan indeks massa tubuh (BMI)
        //berat(kg) / tinggi (m) * tinggi(m)
        double bmi = kucing.getBerat() / (kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01);
        System.out.println("indek masa tubuh : " + bmi);
    }
}
