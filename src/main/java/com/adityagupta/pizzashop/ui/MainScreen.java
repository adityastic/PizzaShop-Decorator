package com.adityagupta.pizzashop.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainScreen window = new MainScreen();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainScreen() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Pizza Ordering System");
        frame.setBounds(100, 100, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("New Order");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OrderPizza window = new OrderPizza();
                window.frame.setVisible(true);
            }
        });
        btnNewButton.setBounds(90, 101, 117, 29);
        frame.getContentPane().add(btnNewButton);

        JButton btnPreviousOrders = new JButton("All Orders");
        btnPreviousOrders.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AllOrders window = new AllOrders();
                window.frame.setVisible(true);
            }
        });
        btnPreviousOrders.setBounds(90, 160, 117, 29);
        frame.getContentPane().add(btnPreviousOrders);
    }
}
