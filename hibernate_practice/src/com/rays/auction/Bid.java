package com.rays.auction;

public class Bid {
    private int id;
    private int amount;
    private String timeStamp;

    // Constructors
    public Bid() {} // Required for Hibernate
    public Bid(int id, int amount, String timeStamp) {
        this.id = id;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }
    public String getTimeStamp() { return timeStamp; }
    public void setTimeStamp(String timeStamp) { this.timeStamp = timeStamp; }
}

