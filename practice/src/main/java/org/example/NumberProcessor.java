package org.example;

import java.util.List;

public class NumberProcessor {

    public void printEvenNumbers(List<Integer> numbers) {
        System.out.println("Even Numbers List -->");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public void squareNumbers(List<Integer> numbers) {
        System.out.println("Square of Numbers -->");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }

    public void calculateSum(List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of Numbers: " + sum);
    }

    public void sumOfEvenNumbers(List<Integer> numbers) {
        int sumOfEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of Even Numbers: " + sumOfEvens);
    }

    public void concatenateNumbers(List<Integer> numbers) {
        String result = numbers.stream()
                .map(Object::toString)
                .reduce("", (a, b) -> a + b);
        System.out.println("Concatenated Numbers: " + result);
    }
}