package com.pramod.java8StreamApi.StringStreamAPI;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLongestStringLength {

    public static void main(String[] args) {
        String s = "I am learning the Stream api in Java";

        // find the 2nd highest length of string in sentacne

        int num = Arrays.stream(s.split(" "))
                .map(x -> x.length())
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        System.out.println("Number of 2nd highest length of the string : " + num);
    }

}
