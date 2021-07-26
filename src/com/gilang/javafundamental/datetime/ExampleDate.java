package com.gilang.javafundamental.datetime;

import java.util.Calendar;

public class ExampleDate {
    public static void main(String[] args) {
        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
    }
}
