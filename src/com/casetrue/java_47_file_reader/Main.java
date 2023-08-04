package com.casetrue.java_47_file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /**
         * FileReader = read the content of a file as a stream of characters.
         * one by one
         * read() returns an integer value which contains the byte value
         * when read() returns -1, there is no more data to be read
         */

        try {
            FileReader fileReader = new FileReader("src/assets/ascii_art.txt");
            int data;
            data = fileReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}
