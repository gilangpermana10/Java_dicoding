package com.gilang.javafundamental.operator;

public class operatorUnary {
    public static void main(String[] args) {
        int awal = 5;
        System.out.println("operator unari plus");
        int hasil = +awal;
        System.out.println("hasil operasi unari +5 " + hasil);

        System.out.println("\noperasi unari minus");
        int awal2 = -awal;
        System.out.println("Hasil operasi unari -5 " + awal2);

        System.out.println("\noperasi unari ++");
        int awal3 = 5 ;
        int hasil3 = awal3++;
        hasil3++;
        System.out.println("Hasil operasi unari 5++ " + hasil3);

        System.out.println("\noperasi unari --");
        int awal4 = 5;
        int hasil4 = awal4--;
        hasil4--;
        System.out.println("Hasil operasi unari 5-- " + hasil4);

        System.out.println("\noperator komplemen logika ");
        boolean sukses = false;
        System.out.println("hasil !false " + !sukses);


    }
}
