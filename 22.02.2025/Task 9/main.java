import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sample data for operations
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        List<String> fruits = Arrays.asList("apple", "banana", "Cherry", "date");

        // 1. Calculate the average
        double average = StreamOperations.calculateAverage(numbers);
        System.out.println("Average: " + average);

        // 2. Convert strings to uppercase and lowercase
        List<String> upperCaseFruits = StreamOperations.toUpperCaseList(fruits);
        List<String> lowerCaseFruits = StreamOperations.toLowerCaseList(fruits);
        System.out.println("Uppercase: " + upperCaseFruits);
        System.out.println("Lowercase: " + lowerCaseFruits);

        // 3. Sum of even and odd numbers
        int sumEven = StreamOperations.sumEven(numbers);
        int sumOdd = StreamOperations.sumOdd(numbers);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        // 4. Remove duplicate elements from a list
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3);
        List<Integer> uniqueList = StreamOperations.removeDuplicates(listWithDuplicates);
        System.out.println("Unique elements: " + uniqueList);

        // 5. Count strings starting with a specific letter (e.g., 'a')
        char specificLetter = 'a';
        long count = StreamOperations.countStringsStartingWith(fruits, specificLetter);
        System.out.println("Number of strings starting with '" + specificLetter + "': " + count);

        // 6. Sort strings in ascending and descending order
        List<String> sortedAsc = StreamOperations.sortStringsAscending(fruits);
        List<String> sortedDesc = StreamOperations.sortStringsDescending(fruits);
        System.out.println("Sorted Ascending: " + sortedAsc);
        System.out.println("Sorted Descending: " + sortedDesc);

        // 7. Find maximum and minimum values in the list of integers
        int max = StreamOperations.findMax(numbers);
        int min = StreamOperations.findMin(numbers);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
