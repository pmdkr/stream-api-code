package com.pramod.java8StreamApi.ClassLevelStreamExample;

public class OrderTransections {

    private final String category;
    private final int amount;

    OrderTransections(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "OrderTransections{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }
}
