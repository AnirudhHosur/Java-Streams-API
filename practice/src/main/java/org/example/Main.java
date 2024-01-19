package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Creating an instance of NumberProcessor
        NumberProcessor processor = new NumberProcessor();

        // Using NumberProcessor methods to display output
        processor.printEvenNumbers(numbers);
        processor.squareNumbers(numbers);
        processor.calculateSum(numbers);
        processor.sumOfEvenNumbers(numbers);
        processor.concatenateNumbers(numbers);
    }
}