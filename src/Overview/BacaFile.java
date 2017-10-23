package Overview;


import java.io.FileInputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iwanna
 */
public class BacaFile {
    public static void main(String[] args) {
        FileInputStream input = null;
        int data;
        
        try {
            input = new FileInputStream("/home/iwanna/file3.txt");
        
            while((data = input.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException ex) {
            System.out.println("Ada Error!");
        }
    }
}
