package com.gilang.javafundamental.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("Latihan_in.txt");
            out = new FileWriter("Latihan_out.txt");
            int c;

            while ((c = in.read()) != -1){
               out.write(c);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (in!=null){
                    in.close();
                }

                if (out != null){
                    out.close();
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
