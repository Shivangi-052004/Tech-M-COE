package sample;

import java.io.*;

public class FileReaderExample4 {
    
    public static void checkIfExists(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("The specified file/directory exists: " + path);
        } else {
            System.out.println("The specified file/directory does not exist: " + path);
        }
    }
    
    public static void main(String[] args) {
        checkIfExists("C:\\C:\Users\shiva\OneDrive\Documents\Example.txt"); // Change the path as needed
    }
}
