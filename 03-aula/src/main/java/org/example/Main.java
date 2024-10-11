package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    static void checkEvenNumber(List<Integer> numbers, Predicate<Integer> validate) {
        numbers.forEach(integer -> {
            if (validate.test(integer)) {
                System.out.println("Odd");
            } else {
                System.out.println("Even");
            }
        });

    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        checkEvenNumber(numbers, number -> (number % 2 != 0));

    }

}