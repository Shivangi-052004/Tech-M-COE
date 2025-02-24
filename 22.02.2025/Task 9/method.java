import java.util.*;
import java.util.stream.*;

public class StreamOperations {

    // 1. Calculate the average of a list of integers using streams.
    public static double calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                      .mapToInt(Integer::intValue)
                      .average()
                      .orElse(0);
    }

    // 2a. Convert a list of strings to uppercase using streams.
    public static List<String> toUpperCaseList(List<String> strings) {
        return strings.stream()
                      .map(String::toUpperCase)
                      .collect(Collectors.toList());
    }
    
    // 2b. Convert a list of strings to lowercase using streams.
    public static List<String> toLowerCaseList(List<String> strings) {
        return strings.stream()
                      .map(String::toLowerCase)
                      .collect(Collectors.toList());
    }
    
    // 3a. Calculate the sum of all even numbers in a list using streams.
    public static int sumEven(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .mapToInt(Integer::intValue)
                      .sum();
    }
    
    // 3b. Calculate the sum of all odd numbers in a list using streams.
    public static int sumOdd(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n % 2 != 0)
                      .mapToInt(Integer::intValue)
                      .sum();
    }
    
    // 4. Remove all duplicate elements from a list using streams.
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                      .distinct()
                      .collect(Collectors.toList());
    }
    
    // 5. Count the number of strings in a list that start with a specific letter using streams.
    public static long countStringsStartingWith(List<String> strings, char letter) {
        return strings.stream()
                      .filter(s -> s.toLowerCase().startsWith(String.valueOf(letter).toLowerCase()))
                      .count();
    }
    
    // 6a. Sort a list of strings in alphabetical order (ascending) using streams.
    public static List<String> sortStringsAscending(List<String> strings) {
        return strings.stream()
                      .sorted()
                      .collect(Collectors.toList());
    }
    
    // 6b. Sort a list of strings in alphabetical order (descending) using streams.
    public static List<String> sortStringsDescending(List<String> strings) {
        return strings.stream()
                      .sorted(Comparator.reverseOrder())
                      .collect(Collectors.toList());
    }
    
    // 7a. Find the maximum value in a list of integers using streams.
    public static int findMax(List<Integer> numbers) {
        return numbers.stream()
                      .max(Integer::compareTo)
                      .orElseThrow(NoSuchElementException::new);
    }
    
    // 7b. Find the minimum value in a list of integers using streams.
    public static int findMin(List<Integer> numbers) {
        return numbers.stream()
                      .min(Integer::compareTo)
                      .orElseThrow(NoSuchElementException::new);
    }
}
