package com.gilang.javafundamental.operator;

public class operatorConditional {
    public static void main(String[] args) {
        int a =4;
        int b =5;

        System.out.println("conditional AND");
        boolean result = a == 3 && b ==5;
        boolean anotherResult = a != 3 && b == 5;

        System.out.println("Hasil Operator And pada syarat a = 3 dan b = 5 adalah " + result);
        System.out.println("Hasil Operator And pada syarat a != 3 dan b = 5 adalah " + anotherResult);

        System.out.println("\nConditional OR");
        result = a == 3|| b ==5;
        anotherResult = a != 3 || b==5;

        System.out.println("Hasil Operator OR pada syarat a = 3 dan b = 5 adalah " + result);
        System.out.println("Hasil Operator OR pada syarat a = 3 dan b = 5 adalah " + anotherResult);
    }
}
