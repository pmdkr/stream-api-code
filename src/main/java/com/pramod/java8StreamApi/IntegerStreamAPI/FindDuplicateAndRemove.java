package com.pramod.java8StreamApi.IntegerStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateAndRemove {

    //remove duplicate and sort them in descending order

    public static void main(String[] args) {
        System.out.println("Remove duplicate and sort them in descending order");


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8);

        List<Integer> finalList = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        System.out.println(finalList);


    }
}
