package Overview;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iwanna
 */
public class InputKarakter {
    public static void main(String[] args) {
        try {
            System.out.println("Masukkan Sembarang Karakter ");
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            String ch = (String) br.readLine();
            System.out.println("Karakter yang dimasukkan yaitu : "+ch);
        } catch (IOException ex) {
            System.out.println("Ada Error!");
        }
    }
}
