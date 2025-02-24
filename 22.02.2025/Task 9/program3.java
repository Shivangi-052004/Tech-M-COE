import java.util.Arrays;
import java.util.List;

public class SumEvenOddNumbers {
    public static void main(String[] args) {
        // Define a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Calculate the sum of even numbers using streams
        int evenSum = numbers.stream()
                             .filter(n -> n % 2 == 0)   // Keep only even numbers
                             .mapToInt(Integer::intValue)
                             .sum();
        
        // Calculate the sum of odd numbers using streams
        int oddSum = numbers.stream()
                            .filter(n -> n % 2 != 0)   // Keep only odd numbers
                            .mapToInt(Integer::intValue)
                            .sum();
        
        // Print the results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
