package com.pramod.java8StreamApi.flatMap;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class DemoFlatMap2 {
    public static void main(String[] args) {
        System.out.println("flatMap with string");

        List<String> teamA = Arrays.asList("Pramod", "Keshav");
        List<String> teamB = Arrays.asList("Rohan", "Ravi");
        List<String> teamC = Arrays.asList("Shubham", "Ramesh");

        List<List<String>> playerInWorldCup = new ArrayList<>();

        playerInWorldCup.add(teamA);
        playerInWorldCup.add(teamB);
        playerInWorldCup.add(teamC);

        // print all player name present in world cup
        // before java 8 - enhanced for loop

        // for (List<String> lst : playerInWorldCup) {
        // for (String name : lst) {
        // System.out.println(name);
        // }
        // }

        // with stream api

        List<String> nameOfPlayer = playerInWorldCup.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

        System.out.println(nameOfPlayer);

    }

}
