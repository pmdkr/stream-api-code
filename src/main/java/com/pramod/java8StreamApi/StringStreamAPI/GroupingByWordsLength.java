package com.pramod.java8StreamApi.StringStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByWordsLength {

    static void main() {
        List<String> words = Arrays.asList("apple", "bnana", "pear", "grape", "kiwi", "orange");
        Map<Integer, List<String>> lengthByString = words.stream()
                .collect(Collectors.groupingBy(String::length));


        System.out.println(lengthByString);

    }
}
