 public static void checkIfDirectoryOrFile(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("It is a directory.");
        } else if (file.isFile()) {
            System.out.println("It is a file.");
        } else {
            System.out.println("Invalid path.");
        }
    }
    
    public static void getLastModifiedDate(String path) {
        File file = new File(path);
        System.out.println("Last modified date: " + file.lastModified());
    }
    
    public static void readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
    }
    
    public static void getFileSize(String path) {
        File file = new File(path);
        long bytes = file.length();
        System.out.println("Size: " + bytes + " bytes, " + (bytes / 1024) + " KB, " + (bytes / (1024 * 1024)) + " MB");
    }
    
    public static void readFileToByteArray(String path) throws IOException {
        byte[] content = Files.readAllBytes(Paths.get(path));
        System.out.println("File content in bytes: " + content.length);
    }
    
    public static void readFileLineByLine(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
    
    public static void readPlainTextFile(String path) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path)));
        System.out.println(content);
    }
