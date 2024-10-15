package org.example;

import java.util.ArrayList;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static <T> void tests(Predicate<T> validate, T input) {
        System.out.println(validate.test(input));
    }

    public static void main(String[] args) {
        Predicate<Integer> isPositive = (Integer i) -> i > 0;
        Predicate<String> isFirstLetterA = (String s) -> s.startsWith("a");
        Predicate<ArrayList<Integer>> isListGreaterThan5 = (ArrayList<Integer> list) -> list.size() > 5;

        ArrayList<Integer> nList = new ArrayList<>();
        nList.add(1);
        nList.add(1);
        nList.add(1);
        nList.add(1);
        nList.add(1);
        nList.add(1);


        tests(isPositive, 5);
        tests(isFirstLetterA, "ana");
        tests(isFirstLetterA, "carlo");
        tests(isListGreaterThan5, nList);


    }
}