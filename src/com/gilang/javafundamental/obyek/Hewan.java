package com.gilang.javafundamental.obyek;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    public Hewan(String namaHewan){
        nama = namaHewan;
    }

    public void beratHewan(int berathewan){
        berat = berathewan;
    }

    public void jumlahKakiHewan(int jumlahKakihewan){
        jumlahKaki = jumlahKakihewan;
    }


    public void cetak(){
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat hewan : " + berat + "kg");
        System.out.println("Jumlah kaki : " + jumlahKaki);
    }
}
