package com.springdemos.springcore.shopping;


public class Cart {
	
	private Item Shopping;

	public Item getShopping() {
		return Shopping;
	}

	public void setShopping(Item shopping) {
		Shopping = shopping;
	}

	@Override
	public String toString() {
		return "Cart [Shopping=" + Shopping + "]";
	}

	

}
