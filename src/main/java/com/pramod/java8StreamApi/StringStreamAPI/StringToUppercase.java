package com.pramod.java8StreamApi.StringStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUppercase {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("pramod", "Lohra", "kuMar");

        List<String> upperCaseNames = names.stream()
                .map(item -> item.toUpperCase())
                .collect(Collectors.toList());


        System.out.println(upperCaseNames);


    }
}
