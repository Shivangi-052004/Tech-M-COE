package sample;

import java.util.*;

public static void main(String[] args) {
        // Testing the methods
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        System.out.println("Arrays Equal: " + areArraysEqual(arr1, arr2));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum Even/Odd: " + sumEvenOdd(numbers));

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        System.out.println("Index of 'banana': " + findFirstOccurrence(words, "banana"));

        System.out.println("Reversed List: " + reverseList(words));

        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        System.out.println("Merged List: " + mergeListsAlternately(list1, list2));
    }
