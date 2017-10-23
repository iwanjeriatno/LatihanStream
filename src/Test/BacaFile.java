/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author iwanna
 */
public class BacaFile {
    FileInputStream f;
    boolean ada;
    
    public BacaFile() {
        byte dataIn[];
        dataIn = new byte[1200];
        File fl = new File("/home/iwanna/file3.txt");
        
        if(fl.exists() && fl.isFile()) {
            System.out.println("Ok");
        }
        else {
            System.out.println("File not Found");
            System.exit(-1);
        }
        
        try {
            f = new FileInputStream(fl);
            ada = false;
            int count = 0;
            
            while(!ada) {
                int input = f.read();
                if(input == -1)
                    ada = true;
                else 
                    count++;
            }
            f.close();
            System.out.println("Jumlah bytes: "+count);
        } catch (IOException ex) {
            System.out.println("Ada Error");
        }
        
    }
    
    public static void main(String[] args) {
        new BacaFile();
    }
}
