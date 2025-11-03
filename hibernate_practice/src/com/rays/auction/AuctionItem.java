package com.rays.auction;

import java.util.Set;

public class AuctionItem {
    private int id;
    private Set<Bid> bids;
    private String description;

    // Constructors
    public AuctionItem() {} // Required for Hibernate
    public AuctionItem(int id, Set<Bid> bids, String description) {
        this.id = id;
        this.bids = bids;
        this.description = description;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Set<Bid> getBids() { return bids; }
    public void setBids(Set<Bid> bids) { this.bids = bids; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
