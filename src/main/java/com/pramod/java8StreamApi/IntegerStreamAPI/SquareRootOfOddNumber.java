package com.pramod.java8StreamApi.IntegerStreamAPI;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class SquareRootOfOddNumber {

    public static void main(String[] args) {
        //find odd number from the list and print square root of list

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 9);

        List<Integer> oddNumberSquareList = list.stream().filter(elem -> elem % 2 != 0)
                .distinct()
                .map(el -> el * el)
                .collect(Collectors.toList());


        System.out.println(oddNumberSquareList);
    }
}
