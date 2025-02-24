package sample;

import java.io.*;

public class FileReaderExample2{
    
    public static void readFile(String filePath) throws FileNotFoundException, IllegalArgumentException, IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
        
        if (file.length() == 0) {
            throw new IllegalArgumentException("File is empty: " + filePath);
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

