package com.pramod.java8StreamApi.IntegerStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequancyOfEachElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 85, 4, 32, 4, 57, 7, 53, 2, 2, 4, 5, 6);


        // we will use grouping by , first parameter will be key, and second will the opertiaon we
        // want to perfrom respectvely to that key

        Map<Integer, Long> frequeancyOfEement = list.stream().collect(
                Collectors.groupingBy(elem -> elem, Collectors.counting())
        );


        System.out.println(frequeancyOfEement);
    }
}
