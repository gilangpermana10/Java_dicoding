package com.gilang.javafundamental.inputoutput;
import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        System.out.println("Program penjumlahan dengan Scanner");
        System.out.println("Masukan angka ke-1" );
        int a = baca.nextInt();

        System.out.println("Masukan angka ke-2");
        int b =  baca.nextInt();

        int result = a + b;
        System.out.println("Jumlah = " + result);
    }
}
