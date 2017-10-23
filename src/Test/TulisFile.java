/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author iwanna
 */
public class TulisFile {
    FileOutputStream fout;
    String teks = "Hello World!";
    
    byte buf[];
    
    public TulisFile() {
        File f = new File("/home/iwanna/file3.txt");
        
        try {
            fout = new FileOutputStream(f);
            buf = teks.getBytes();
            fout.write(buf);
            fout.flush();
            fout.close();
            System.out.println("Text di tulis ke file : "+f.getName());
        } catch (IOException ex) {
            System.out.println("Ada Error!");
        }
        
    }
    
    public static void main(String[] args) {
        new TulisFile();
    }
}
