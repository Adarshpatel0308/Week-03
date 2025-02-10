package org.example.largefilereadingefficiency;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReading {
    //Method to read the file Using FileReader
    public static void readFileByFileReader(String path) {
        String example = path;
        try (FileReader fr = new FileReader(example)) {

        } catch (IOException e) {
            //System.out.println(e.getMessage());
        }
    }
    //Method to read the file Using InputStreamReader
    public static  void readFileByInputStreamReader(String path2) {
        String example = path2;
        try (InputStreamReader inr = new InputStreamReader(new FileInputStream(example))) {

        } catch (IOException e) {
            //System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        //Array which contains the path of the files
        String[] arr = {"1mb.txt","100mb.txt","500mb.txt"};
        for (String i : arr) {
            double start = System.nanoTime();
            readFileByFileReader(i); //Call FileReader function
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by FileReader to read  " + i + " file is: " + finalTime + " ms");
        }
        System.out.println("--------------------------------------------------------------------------------------");

        for (String i : arr) {
            double start = System.nanoTime();
            readFileByInputStreamReader(i); //Call InputStreamReader
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by InputStreamReader to read " + i + " file is: " + finalTime + " ms");
        }
    }
}

