package com.gilang.javafundamental.operator;

public class operatorEquality {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        boolean result;
        result = a == b;

        System.out.println("nilai a = 5");
        System.out.println("nilai b = 4");

        System.out.println("sama dengan : " + result);

        boolean result2 = a > b;
        boolean result3 = a < b;
        boolean result4 = a != b;
        boolean result5 = a >= b;
        boolean result6 = a <= b;

        System.out.println("Lebih dari : " + result2);
        System.out.println("kurang dari : " + result3);
        System.out.println("tidak sama dengan  : " + result4);
        System.out.println("Lebih atau sama dengan : " + result5);
        System.out.println("kurang atau sama dengan : " + result6);

    }
}
