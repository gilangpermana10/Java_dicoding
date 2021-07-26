package com.gilang.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            //Mencoba membaca berkas latiihan.txt
            File file = new File("coba.txt");
            FileReader fr = new FileReader(file);
            //Jika berhasil maka tampilkan pesan
            System.out.println("Read File Berhasil");
        }catch (Exception e){
            //jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }
    }

}
