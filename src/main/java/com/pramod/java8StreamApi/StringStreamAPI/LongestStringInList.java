package com.pramod.java8StreamApi.StringStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringInList {

    public static void main(String[] args) {
        //find the longest String present in the list of the string


        List<String> strList = Arrays.asList("I", "am", "learning", "the", "stream", "in", "java");

        Optional<String> longestsString = strList.stream()
                .max(Comparator.comparing(elem -> elem.length()));


        if (longestsString.isPresent()) {
            System.out.println(longestsString.get());
        }


    }
}
