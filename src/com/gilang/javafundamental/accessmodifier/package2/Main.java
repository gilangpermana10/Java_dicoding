package com.gilang.javafundamental.accessmodifier.package2;

import com.gilang.javafundamental.accessmodifier.package1.KelasA;

public class Main {
    public static void main(String[] args) {
        //kode ini pasti akan mengalami compiler error
        KelasA kelasA = new KelasA();
//        System.out.println(kelasA.functionB);
//        System.out.println(kelasA.memberB);
//        System.out.println(kelasA.memberC);

        kelasB KelasBe = new kelasB();
        KelasBe.methodC();
    }
}
