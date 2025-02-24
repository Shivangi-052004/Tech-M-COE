public class FileReaderExample {
    // 1. Check if two arrays are equal
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }

    // 2. Sum of even and odd numbers
    public static <T extends Number> Map<String, Integer> sumEvenOdd(List<T> numbers) {
        int evenSum = 0, oddSum = 0;
        for (T num : numbers) {
            if (num.intValue() % 2 == 0) evenSum += num.intValue();
            else oddSum += num.intValue();
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("EvenSum", evenSum);
        result.put("OddSum", oddSum);
        return result;
    }

    // 3. Find index of first occurrence
    public static <T> int findFirstOccurrence(List<T> list, T target) {
        return list.indexOf(target);
    }

    // 4. Reverse a list
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }

    // 5. Merge two lists alternately
    public static <T> List<T> mergeListsAlternately(List<T> list1, List<T> list2) {
        List<T> merged = new ArrayList<>();
        int size = Math.max(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            if (i < list1.size()) merged.add(list1.get(i));
            if (i < list2.size()) merged.add(list2.get(i));
        }
        return merged;
    }
