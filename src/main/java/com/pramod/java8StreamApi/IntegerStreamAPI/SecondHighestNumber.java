package com.pramod.java8StreamApi.IntegerStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestNumber {

    public static void main(String[] args) {
        // find the second highest number from the list


        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10, 11);

//        List<Integer> SecondHighestNumber = list.stream().sorted(Comparator.reverseOrder())
//                .skip(1)
//                .limit(1)
//                .collect(Collectors.toList());


        Optional<Integer> secondHighestNumber = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();


        if (secondHighestNumber.isPresent()) {
            System.out.println(secondHighestNumber.get());
        }

    }
}
