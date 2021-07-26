package com.gilang.javafundamental.bangundatar;
import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner baca = new Scanner(System.in);

    public static void main(String[] args) {
        //Kamus
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1,s2,r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        //program
        mainMenu();

        //kondisional untuk pilihan menu
        switch (pilihan){
            case '1':{
                System.out.print("Masukan panjang persegi : ");
                s1 = baca.nextInt();
                System.out.print("Masukan Lebar Persegi : ");
                s2 = baca.nextInt();
                System.out.println("Luas Persegi panjang : " + opersegi.luas(s1,s2));
                System.out.println("Keliling persegi : " + opersegi.keliling(s1,s2));
                break;
            }
            case '2':{
                System.out.print("Masukan panjang segitiga : ");
                s1 = baca.nextInt();
                System.out.print("Masukan Lebar segitiga : ");
                s2 = baca.nextInt();
                System.out.println("Luas segitiga : " + osegitiga.luas(s1,s2));
                System.out.println("Keliling segitiga : " + osegitiga.keliling(s1,s2));
                break;
            }
            case '3':{
                System.out.print("Masukan Jari-jari lingkaran : ");
                r = baca.nextInt();
                System.out.println("Luas lingkaran  : " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran : " + olingkaran.keliling(r));
                break;
            }
            default:{
                System.out.println("Anda tidak memilih apapun");
                break;
            }
        }
    }

    public static void mainMenu(){
        //pilihan menu
        System.out.println("===================");
        System.out.println("Hitung Luas dan keliling");
        System.out.println("1. Persegi panjang");
        System.out.println("2. Segitiga siku-siku");
        System.out.println("3. Lingkaran");
        System.out.println("Masukan Menu : ");
        pilihan = baca.next().charAt(0);


    }
}
