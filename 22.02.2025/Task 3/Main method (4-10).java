 public static void main(String[] args) {
        String path = "C:\\Users\\shiva\\OneDrive\\Documents,New.txt";
        
        checkIfExists(path);
        checkPermissions(path);
        checkIfDirectoryOrFile(path);
        getLastModifiedDate(path);
        readFromConsole();
        getFileSize(path);
        try {
            readFileToByteArray(path);
            readFileLineByLine(path);
            readPlainTextFile(path);
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
