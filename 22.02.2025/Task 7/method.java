
public class FileReaderExample {
    
    // 1. Create an array list, add colors, and print it
    public static void createAndPrintColors() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Colors: " + colors);
    }

    // 2. Iterate through all elements
    public static void iterateColors() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        for (String color : colors) {
            System.out.println(color);
        }
    }

    // 3. Insert an element at the first position
    public static void insertAtFirstPosition() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        colors.add(0, "Yellow");
        System.out.println("After inserting at first position: " + colors);
    }

    // 4. Retrieve an element at a specified index
    public static void retrieveElement() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Element at index 2: " + colors.get(2));
    }

    // 5. Update an array element
    public static void updateElement() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        colors.set(1, "Black");
        System.out.println("After updating element at index 1: " + colors);
    }

    // 6. Remove the third element
    public static void removeThirdElement() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        colors.remove(2);
        System.out.println("After removing third element: " + colors);
    }

    // 7. Search for an element
    public static void searchElement() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Contains 'Blue': " + colors.contains("Blue"));
    }

    // 8. Sort the array list
    public static void sortList() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        Collections.sort(colors);
        System.out.println("Sorted List: " + colors);
    }

    // 9. Copy one array list into another
    public static void copyList() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        List<String> colorsCopy = new ArrayList<>(colors);
        System.out.println("Copied List: " + colorsCopy);
    }

    // 10. Shuffle elements in the array list
    public static void shuffleList() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        Collections.shuffle(colors);
        System.out.println("Shuffled List: " + colors);
    }
