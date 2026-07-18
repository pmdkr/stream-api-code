package com.pramod.java8StreamApi.IntegerStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateNumberIntoEvenOdd {

    public static void main(String[] args) {
        // create a partition of the list containing even and odd

        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10, 11);

        Map<Boolean, List<Integer>> newList = list.stream()
                .collect(Collectors.partitioningBy(elem -> elem % 2 == 0));


        System.out.println(newList);


    }
}
