package com.gilang.javafundamental.array;

public class IndexOutOfBound {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        //Akses indeks ke 4
        System.out.println(array[4]);
    }
}
