package com.springdemos.springcore.shopping;

import java.util.List;

public class Item {

	private List<String> items;

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Item [items=" + items + "]";
	}

}
