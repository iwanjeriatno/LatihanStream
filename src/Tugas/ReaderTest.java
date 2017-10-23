/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author iwanna
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ReaderTest.java"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
            //jangan lupa untuk selalu memanggil close setelah reader tidak digunakan
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
