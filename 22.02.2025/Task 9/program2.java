import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConversion {
    public static void main(String[] args) {
        // Define a list of strings
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry");

        // Convert to uppercase using streams
        List<String> uppercase = strings.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());

        // Convert to lowercase using streams
        List<String> lowercase = strings.stream()
                                        .map(String::toLowerCase)
                                        .collect(Collectors.toList());

        // Print the results
        System.out.println("Uppercase strings: " + uppercase);
        System.out.println("Lowercase strings: " + lowercase);
    }
}
