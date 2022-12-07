package it.develhope.stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        String str = String.valueOf(LocalDateTime.now());

        String fileName = "src/file.txt";

        try {

            File f = new File(fileName);
            if (f.exists()) {
                System.out.println("The file exists: you will overwrite it.");
            } else System.out.println("The file doesn't exists, creating of a new file.");

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}