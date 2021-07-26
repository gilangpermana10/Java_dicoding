package com.gilang.javafundamental.vokalkonsonan;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        //kamus
        String kata;
        int vokal =0,konsonan=0;

        //Program
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukan kata : ");
        kata = baca.next();

        System.out.println("Jumlah vokal adalah " + num_vokal(kata));
        System.out.println("Jumlah Konsonan adalah " + num_konsonan(kata));
    }

    private static int num_vokal(String kata){
        int i;
        int jumlah_vokal=0;

        for (i =0; i<kata.length();i++){
            if (kata.charAt(i) == 'a' || kata.charAt(i) == 'i' || kata.charAt(i) == 'u' || kata.charAt(i) == 'e' || kata.charAt(i) == 'o' ){
                jumlah_vokal++;
            }
        }return jumlah_vokal;
    }

    private static int num_konsonan(String kata){
        int i;
        int jumlah_konsonan=0;

        for (i =0; i<kata.length();i++){
            if (kata.charAt(i) != 'a' || kata.charAt(i) != 'i' || kata.charAt(i) != 'u' || kata.charAt(i) != 'e' || kata.charAt(i) != 'o' ){
                jumlah_konsonan++;
            }
        }return jumlah_konsonan;
    }

}
