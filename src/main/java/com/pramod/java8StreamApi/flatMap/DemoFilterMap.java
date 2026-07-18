package com.pramod.java8StreamApi.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoFilterMap {
    public static void main(String[] args) {
        System.out.println("flatMap >>>>>>>>>>>>>");

        // map
        List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 8, 9, 5, 66, 3, 32);

        List<Integer> list2 = list1.stream().map(x -> x * 10).collect(Collectors.toList());

        // map will transfer each element and return a new stream with same length
        System.out.println(list2);

        // flatMap

        List<Integer> lst1 = Arrays.asList(1, 2);
        List<Integer> lst2 = Arrays.asList(3, 4, 5);
        List<Integer> lst3 = Arrays.asList(7, 8);

        List<List<Integer>> finalList = Arrays.asList(lst1, lst2, lst3);

        List<Integer> OneFinalList = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(OneFinalList);
    }

}
