package com.gilang.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {
    public static void main(String[] args) {
        //Menampilkan waktu sekaran
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah : " + calendar.getTime());

        //Menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 Hari yang lalu : " + calendar.getTime());

        //Menampilkan waktu 4 bulan yang lalu
        calendar.add(Calendar.MONTH, -4);
        System.out.println("4 bulan yang lalu : " + calendar.getTime());

        //Menampilakan waktu 2 tahun yang lalu
        calendar.add(Calendar.YEAR, -2);
        System.out.println("2 Tahun yang lalu : " + calendar.getTime());
    }
}
