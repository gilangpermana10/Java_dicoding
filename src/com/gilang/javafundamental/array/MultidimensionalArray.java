package com.gilang.javafundamental.array;

public class MultidimensionalArray {
    public static void main(String[] args) {
        char[][] array= new char[2][];

        array[0] = new char[2];
        array[1] = new char[3];

        //Dimensi 1 indeks 0 memiliki panjang elemen 2
        array[0][0] = 'A';
        array[0][1] = 'B';

        //Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
        array[1][0] = 'C';
        array[1][1] = 'D';
        array[1][2] = 'E';

        //Menampilkan indeks [0]
        System.out.println("Dimensi 1 indeks 0 : " + array[0][0]);
        System.out.println("Dimensi 1 indeks 1 : " + array[0][1]);

        //menampilkan indeks 1
        System.out.println("Dimensi 2 indeks 0 : " + array[1][0]);
        System.out.println("Dimensi 2 indeks 1 : " + array[1][1]);
        System.out.println("Dimensi 2 indeks 2 : " + array[1][2]);


    }
}
