package com.gilang.javafundamental.basic;

import com.gilang.javafundamental.basic.kendaraan.*;
import com.gilang.javafundamental.basic.musik.gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String teks = "halo nama saya gilang permana";
        String result = teks.replace("a", "i");
        System.out.println(result);

        Date today = new Date();
        System.out.println("hari ini = " + today);
        Date besok = DateUtils.addDays(today, 1);
        System.out.println("besok = " + besok);
    }
}
