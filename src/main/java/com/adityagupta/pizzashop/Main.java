package com.adityagupta.pizzashop;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.crusts.PanCrust;
import com.adityagupta.pizzashop.crusts.RegularCrust;
import com.adityagupta.pizzashop.crusts.ThinCrust;
import com.adityagupta.pizzashop.sauces.HummusSauce;
import com.adityagupta.pizzashop.sauces.PestoSauce;
import com.adityagupta.pizzashop.sauces.RegularSauce;
import com.adityagupta.pizzashop.toppings.JalapenoTopping;
import com.adityagupta.pizzashop.toppings.OliveTopping;
import com.adityagupta.pizzashop.toppings.OnionTopping;
import com.adityagupta.pizzashop.toppings.TomatoTopping;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char ch;
        Pizza pizza;

        do{
            System.out.println("Pizza Base Menu !");
            System.out.println("1. Pan Crust");
            System.out.println("2. Regular Crust");
            System.out.println("3. Thin Crust");

            switch (sc.nextInt()){
                case 1:
                    pizza = new PanCrust();
                    break;
                case 2:
                    pizza = new RegularCrust();
                    break;
                default:
                    pizza = new ThinCrust();
                    break;
            }

            System.out.println("Pizza Sauce Menu !");
            System.out.println("1. Hummus Sauce");
            System.out.println("2. Regular Sauce");
            System.out.println("3. Pesto Sauce");

            switch (sc.nextInt()){
                case 1:
                    pizza = new HummusSauce(pizza);
                    break;
                case 2:
                    pizza = new RegularSauce(pizza);
                    break;
                default:
                    pizza = new PestoSauce(pizza);
                    break;
            }

            char toppingCh;
            do{
                System.out.println("Toppings Menu !");
                System.out.println("1. Jalapeno");
                System.out.println("2. Olive");
                System.out.println("3. Onion");
                System.out.println("4. Tomato");

                switch (sc.nextInt()){
                    case 1:
                        pizza = new JalapenoTopping(pizza);
                        break;
                    case 2:
                        pizza = new OliveTopping(pizza);
                        break;
                    case 3:
                        pizza = new OnionTopping(pizza);
                        break;
                    default:
                        pizza = new TomatoTopping(pizza);
                        break;
                }
                sc.nextLine();

                System.out.println("Do you want to add more toppings?");
                toppingCh = sc.nextLine().charAt(0);
            }while(toppingCh == 'y' || toppingCh == 'Y');

            System.out.println("Your Configuration: \n" + pizza.getDescription());
            System.out.println("Total Price for your pizza is : " + pizza.getPrice());

            System.out.println("Do you want to order another pizza?");
            ch = sc.nextLine().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
}
