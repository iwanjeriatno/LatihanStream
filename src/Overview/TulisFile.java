package Overview;

import java.io.FileOutputStream;
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
public class TulisFile {

    public static void main(String[] args) {
        FileOutputStream out;
        String data = "Iwanna";

        try {
            out = new FileOutputStream("/home/iwanna/file3.txt");

            for (int i = 0; i < data.length(); i++) {
                out.write((int) data.charAt(i));
            }
            out.close();
        } catch (IOException ex) {
            System.out.println("Ada Error!");
        }
    }
}
