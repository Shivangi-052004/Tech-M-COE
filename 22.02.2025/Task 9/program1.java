import java.util.Arrays;
import java.util.List;

public class AverageCalculator {
    public static void main(String[] args) {
        // Define a list of integers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        
        // Calculate the average using streams
        double average = numbers.stream()               // Create a stream from the list
                                .mapToInt(Integer::intValue) // Convert Integer to int
                                .average()               // Calculate the average
                                .orElse(0);              // Provide a default value if the list is empty
        
        // Print the result
        System.out.println("Average of numbers: " + average);
    }
}
