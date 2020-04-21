package com.adityagupta.pizzashop.expections;

public class SelectToppingsException extends Exception {
	public SelectToppingsException() {
		super("Select One Topping before proceeding");
	}
}
