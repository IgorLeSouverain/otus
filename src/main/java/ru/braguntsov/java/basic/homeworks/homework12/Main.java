package ru.braguntsov.java.basic.homeworks.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws FileNotFoundException {
        File[] filesList = listFiles(".");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What file do you want to use?");
        String filename = scanner.nextLine();
        for(File f : filesList){
            if(f.getName().equalsIgnoreCase(filename)){
                try (InputStreamReader in = new InputStreamReader(new FileInputStream(f)))  {
                    int n = in.read();
                    while (n != -1) {
                        System.out.print((char) n);
                        n = in.read();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("\nType something to write in the file");
                String someText = scanner.nextLine();
                try (FileOutputStream out = new FileOutputStream(filename)){
                    byte[] buffer = someText.getBytes(StandardCharsets.UTF_8);
                    out.write(buffer);
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
        }
    }
    public static File[] listFiles(String pathname) {
        File curDir = new File(pathname);
        File[] filesList = curDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
        for(File f : filesList){
            System.out.println(f.getName());
        }
        return filesList;
    }
}
