package com.pramod.java8StreamApi.ClassLevelStreamExample;

public class OrderTransections {

    String category;
    Long amount;

    OrderTransections(String category, Long amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public Long getAmount() {
        return amount;
    }
}
