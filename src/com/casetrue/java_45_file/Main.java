package com.casetrue.java_45_file;

import java.io.File;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
     /**
      * file = an abstract representation of file and directory pathnames 
      */   

      File file = new File("src/assets/secret_message.txt");

      if(file.exists()){
          System.out.println(file.getName());
          System.out.println(file.getAbsolutePath());
          System.out.println(file.isFile());
        //   file.deleteOnExit();
      }
      else{
          System.err.println("there is no file right now");
      }
    }
}