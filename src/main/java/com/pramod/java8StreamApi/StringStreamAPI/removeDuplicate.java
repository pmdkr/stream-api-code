package com.pramod.java8StreamApi.StringStreamAPI;

import java.util.stream.Collectors;

public class removeDuplicate {

    public static void main(String[] args) {
        String s = "addffhgdfgdfgfd";

        s.chars().distinct().mapToObj(x -> (char) x).forEach(System.out::println);

//        s.chars().distinct().mapToObj(x -> (char) x).collect(Collectors.joining());

        // String uniqueString = s.chars()
        // .distinct()
        // .mapToObj(x -> String.valueOf((char) x))
        // .collect(Collectors.joining());

        // System.out.println(uniqueString);

        // System.out.println(uniqueString);

    }
}
