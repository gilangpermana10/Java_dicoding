package com.gilang.javafundamental.propertimetode;

public class Hewan {
    //properti atau fields
//    double tinggi;
//    double berat;
//    int umur;
//

//    inisialisasi dengan nilai inisial
    double tinggi  =30 ;
    double berat = 4;

//    inisialisasi melalui konstraktur
    int umur;

    //konstraktur dengan parameter
    Hewan(int umur){
        this.umur= umur;
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat .. ");
    }

    void jalan(){
        System.out.println("berjalan dengan pelan . . ");
    }

    void makan(){
        System.out.println("Makan degan mulut ");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi(){
        return tinggi;
    }

    int getUmur(){
        return umur;
    }
}
