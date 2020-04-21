package com.adityagupta.pizzashop.expections;

public class SelectCrustException extends Exception {
	public SelectCrustException() {
		super("Select Crust before proceeding");
	}
}
