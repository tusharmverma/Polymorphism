package com.company;


public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
	    double price = hamburger.itemizeHamburger();

	    HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
	    healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
	    healthyBurger.itemizeHamburger();

    }

}
