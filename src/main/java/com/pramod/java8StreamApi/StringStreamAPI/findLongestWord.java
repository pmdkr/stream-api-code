package com.pramod.java8StreamApi.StringStreamAPI;

import java.util.Arrays;
import java.util.Comparator;

public class findLongestWord {

    public static void main(String[] args) {

        String s = "I am learning Steam API in java";

        String ans = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length)).get();

        System.out.println(ans);

    }
}
