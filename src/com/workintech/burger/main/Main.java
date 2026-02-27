package com.workintech.burger.main;

import com.workintech.burger.enums.BreadRollType;
import com.workintech.burger.enums.CipsType;
import com.workintech.burger.enums.DrinkType;
import com.workintech.burger.models.*;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", 3.56, "Wrap", BreadRollType.WRAP);

        hamburger.addHamburgerAddition1("Tomato", 0.27);

        hamburger.addHamburgerAddition2("Lettuce", 0.75);

        hamburger.addHamburgerAddition3("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich", BreadRollType.SANDWICH);

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAddition3("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}