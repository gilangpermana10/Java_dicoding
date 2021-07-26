package com.gilang.javafundamental.obyek;

public class Main {
    public static void main(String[] args) {
        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetak();

        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetak();
    }
}
