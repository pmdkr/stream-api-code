package com.pramod.java8StreamApi.IntegerStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxFromListOfInteger {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 56, 98,329);


//        Optional<Integer> maxNumber = list.stream()
//                .max(Integer::compareTo);


        Optional<Integer> maxNumber2 = list.stream()
                .max((a, b) -> a.compareTo(b));
        System.out.println(maxNumber2.get());

    }
}
