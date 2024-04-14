package ru.braguntsov.java.basic.homeworks.homework12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws FileNotFoundException {
        File curDir = new File(".");
        File[] filesList = curDir.listFiles();
        for(File f : filesList){
            if(f.isFile() && f.getName().contains(".txt")){
                System.out.println(f.getName());
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("What file do you want to use?");
        String filename = scanner.nextLine();
        for(File f : filesList){
            if(f.isFile() && f.getName().equalsIgnoreCase(filename) && f.getName().contains(".txt")){
                Scanner myReader = new Scanner(f);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
                System.out.println("Type something to write in the file");
                String someText = scanner.nextLine();
                try {
                    FileWriter myWriter = new FileWriter(f.getName());
                    myWriter.write(someText);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
        }
    }
}
