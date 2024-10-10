package org.example;

// Fig. 17.12: ArraysAndStreams2.java
// Demonstrating lambdas and streams with an array of Strings.
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        String[] strings =
                {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        // display original strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        // strings in uppercase and starting with a vowel
        System.out.printf("Strings in uppercase that start with a vowel: %s%n",
                Arrays.stream(strings)
                        .map(String::toUpperCase)
                        .filter(s -> s.matches("^[AEIOU].*"))
                        .collect(Collectors.toList()));

        // count the number of strings in uppercase that start with a vowel
        long count = Arrays.stream(strings)
                .map(String::toUpperCase)
                .filter(s -> s.matches("^[AEIOU].*"))
                .count(); // No arguments needed

        System.out.printf("Number of strings in uppercase that start with a vowel: %d%n", count);
    }
}
