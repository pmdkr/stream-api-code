package com.pramod.java8StreamApi.ClassLevelStreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalTransectionByCategory {

    public static void main(String[] args) {
        // find total transection by category wise


        List<OrderTransections> trasectionList = Arrays.asList(
                new OrderTransections("Food", 1500),
                new OrderTransections("Shooping", 30000),
                new OrderTransections("Utilities", 20000),
                new OrderTransections("Travel", 23000),
                new OrderTransections("Entertainment", 45000),
                new OrderTransections("Shooping", 25000),
                new OrderTransections("Utilities", 50000),
                new OrderTransections("Travel", 80000),
                new OrderTransections("Entertainment", 90000),
                new OrderTransections("Utilities", 50000),
                new OrderTransections("Entertainment", 45000),
                new OrderTransections("Utilities", 90000),
                new OrderTransections("Entertainment", 87000));


        //find the transection amount(sum of amount) by category wise

        Map<String, Integer> transectioAmountByCat = trasectionList.stream().
                collect(Collectors.
                        groupingBy(elem -> elem.getCategory(),
                                Collectors.summingInt(txn -> txn.getAmount())));


        System.out.println(transectioAmountByCat);


    }
}
