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
public class BacaPrintStream {
    FileInputStream fin;
    
    public BacaPrintStream() {
        byte dataIn[];
        dataIn = new byte[1200];
        
        File f = new File("/home/iwanna/file3.txt");
        
        if(f.exists() && f.isFile()) {
            System.out.println("Ok");
        }
        else {
            System.out.println("File Not Found");
            System.exit(-1);
        }
        
       
        try {
             int len;
            fin = new FileInputStream(f);
            len = fin.read(dataIn, 0, dataIn.length);
            fin.close();
            String teks = new String(dataIn, 0, len);
            System.out.println(teks);
        } catch (IOException ex) {
            System.out.println("Ada Error!");
        }
    }
    
    public static void main(String[] args) {
        new BacaPrintStream();
    }
}
