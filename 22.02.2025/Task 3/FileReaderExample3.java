package sample;

import java.io.*;

public class FileReaderExample3 {
    
    public static void listFiles(String directoryPath) throws FileNotFoundException {
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            throw new FileNotFoundException("Directory not found: " + directoryPath);
        }
        
        String[] fileList = directory.list();
        if (fileList != null) {
            for (String file : fileList) {
                System.out.println(file);
            }
        }
    }
    
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\shiva\\OneDrive\\Documents\New.txt";
        try {
            listFiles(directoryPath);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
