package com.casetrue.java_46_file_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("src/assets/info.txt");
            String content = LocalDate.now().toString() + "\nthis is how to write in file,\n" +
                    "using java fileWriter class.";
            fileWriter.write(content);
            fileWriter.append("\nauthor:: Mohamed EL YONOUSI");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
