package sample;

import java.io.*;

public class FileReaderExample4 {
    
    public static void listFilesWithExtension(String directoryPath, String extension) throws FileNotFoundException {
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            throw new FileNotFoundException("Directory not found: " + directoryPath);
        }
        
        File[] files = directory.listFiles((dir, name) -> name.endsWith(extension));
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
