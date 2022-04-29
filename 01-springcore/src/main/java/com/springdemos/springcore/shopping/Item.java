package com.springdemos.springcore.shopping;

import java.util.List;

public class Item {
	
	private List<String> item;

	public List<String> getItem() {
		return item;
	}

	public void setItem(List<String> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Item [item=" + item + "]";
	}
	
	

}
