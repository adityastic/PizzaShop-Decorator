package com.adityagupta.pizzashop.ui.utils;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.ui.builders.PizzaBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaShopUtils {

    public static String createOrder(String selectedCrust, String selectedSauce, List<String> selectedToppings) {
        Pizza pizza = new PizzaBuilder()
                .buildWithCrust(selectedCrust)
                .buildWithSauce(selectedSauce)
                .buildWithToppings(selectedToppings)
                .build();

        saveOrder(pizza);
        return pizza.getDescription() + "\nTotal Price: " + pizza.getPrice();
    }

    private static void saveOrder(Pizza pizza) {
        ArrayList<Pizza> allPizzas = readAllPizzas();
        allPizzas.add(pizza);
        saveAllPizzas(allPizzas);
    }

    private static void saveAllPizzas(ArrayList<Pizza> allPizzas) {
        try {
            File file = new File("database.bin");
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(allPizzas);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static ArrayList<Pizza> readAllPizzas() {
        try {
            File file = new File("database.bin");
            file.createNewFile();
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Pizza> result = (ArrayList<Pizza>) ois.readObject();
            ois.close();
            return result;
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<Pizza>();
        }
    }

    public static List<Pizza> getAllPizzas() {
        return readAllPizzas();
    }
}
