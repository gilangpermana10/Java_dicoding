package com.gilang.javafundamental.percabangan;

public class ifThenElseIfThenElse {
    public static void main(String[] args) {
        char in = 'C';
        int output = 0;

        switch(in) {
            case 'A':
                output++;

            case 'B':
                output++;

            case 'C':
                output++;

            case 'D':
                output++;

            default:
                output++;
            }
            System.out.println(output);
        }
}
