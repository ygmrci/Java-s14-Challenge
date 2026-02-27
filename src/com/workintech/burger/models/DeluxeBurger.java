package com.workintech.burger.models;

import com.workintech.burger.enums.BreadRollType;
import com.workintech.burger.enums.CipsType;
import com.workintech.burger.enums.DrinkType;

public class DeluxeBurger extends Hamburger {
    private CipsType cips;
    private DrinkType drink;

    public DeluxeBurger() {
        this("Deluxe", 19.10, "Beef", BreadRollType.WRAP, CipsType.NORMAL, DrinkType.COKE);
    }
    public DeluxeBurger(String name, double price, String meat, BreadRollType breadRollType, CipsType cips, DrinkType drink) {
        super(name, 19.10, meat, breadRollType);
        this.cips = cips;
        this.drink = drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }
}
