package sample;

import java.io.*;
import java.util.*;

public class FileReaderExample1 {
    
    public static void readFile(String filePath) throws FileNotFoundException, IllegalArgumentException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
        
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0) {
                    throw new IllegalArgumentException("Positive number found: " + number);
                }
                System.out.println(number);
            }
        }
    }
}
