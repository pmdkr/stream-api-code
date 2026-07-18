package com.pramod.java8StreamApi.StringStreamAPI;

import java.util.Arrays;
import java.util.Comparator;

public class findSecondHighestLength {
    public static void main(String[] args) {
        String s = "I am learning Stream api in java";

        String ans = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(2)
                .findFirst()
                .get();


        System.out.println(ans);

    }
}
