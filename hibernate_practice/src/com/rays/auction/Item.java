package com.rays.auction;

public class Item {
	private int id;
	private String itemName;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String itemName) {
		super();
		this.id = id;
		this.itemName = itemName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	

}
