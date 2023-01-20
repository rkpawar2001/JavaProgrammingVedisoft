//// Java program to delete a directory

package com.vedisoft.se.io;
import java.io.*;
public class Third {
   static void deleteFolder(File file){
      for (File subFile : file.listFiles()) {
         if(subFile.isDirectory()) {
            deleteFolder(subFile);
         } else {
            subFile.delete();
         }
      }
      file.delete();
   }
   public static void main(String args[]) {
      String filePath = "E://Deletable Folder//"; // Doubt - When taking path as command line arguments throws exception.
      //Creating the File object
      File file = new File(filePath);
      deleteFolder(file);
      System.out.println("Files deleted........");
   }
}