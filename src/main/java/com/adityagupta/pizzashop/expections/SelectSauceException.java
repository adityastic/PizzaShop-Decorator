package com.adityagupta.pizzashop.expections;

public class SelectSauceException extends Exception {
    public SelectSauceException() {
        super("Select Sauce before proceeding");
    }
}
