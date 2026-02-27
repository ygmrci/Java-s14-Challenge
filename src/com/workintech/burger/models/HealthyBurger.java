package com.workintech.burger.models;

import com.workintech.burger.enums.BreadRollType;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String meat, BreadRollType breadRollType) {
        super(name, price, meat, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {

    }

    public void addHealthyAddition2(String name, double price) {

    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
