package com.gilang.javafundamental.suhuair;

import java.util.Calendar;
import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        /*
        * Contoh studi kasus suhu air
        * */

        //kamus
        int T;

        //Program
        System.out.println("\nProgram untuk mengetahui bentuk air ");
        System.out.println("Silahkan masukan suhu air : ");

        //membuat Scanner untuk input
        Scanner baca = new Scanner(System.in);
        T = baca.nextInt();

        //Blok b=percabangan
        if(T < 0 ){
            System.out.println("Wujud Air beku " + T);
        }else if(0 <= T && T<=100){
            System.out.println("Wujud air cair " + T );
        }else{
            System.out.println("Wujud Air uap/gas " + T);
        }
    }
}
