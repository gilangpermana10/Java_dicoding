package com.gilang.javafundamental.inputoutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args) {
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(stream);

        System.out.println("Program penjumlahan sederhana : ");
        int a = 0;
        int b = 0;
        try {
            System.out.println("masukan Angka ke-1 : ");
            a = Integer.parseInt(buffer.readLine());
            System.out.println("Masukan Angka ke-2 : ");
            b = Integer.parseInt(buffer.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
        int result = a + b;
        System.out.println("Hasil Penjumlahan : " + result);
    }
}
