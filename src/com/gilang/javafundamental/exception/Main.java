package com.gilang.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            System.out.println("Akses elemen ke 5 : " + a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Trhow : " + e);
        }finally {
            a[4] = 10;
            System.out.println("Nilai Elemen Terakhir: " + a[4]);
        }
    }

}
