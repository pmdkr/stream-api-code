package com.pramod.java8StreamApi.StringStreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OccurenceOfEachWord {

    public static void main(String[] args) {

        // find the occurence of each word - groupingBy used

        String s = "I am learning the stream api Of Java";

        Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    }

}
