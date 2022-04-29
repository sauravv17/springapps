package com.springdemos.springcore.shopping;


public class Cart {
	
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Cart [item=" + item + "]";
	}
	

}
