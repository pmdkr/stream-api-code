package com.pramod.java8StreamApi.IntegerStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 24, 8, 9);

        List<Integer> evenList = list.stream()
                .filter(item -> item % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenList);


    }
}
