package com.pramod.java8StreamApi.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFilter1 {

    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer>evenNoList=list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNoList);

    }


}
