package com.pramod.java8StreamApi.IntegerStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class FindSecondAndThirdNumber {

    public static void main(String[] args) {
        //return second and third number from the lsit of integer

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        List<Integer> secondAndThirdElementList = list.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(secondAndThirdElementList);

    }
}
