package com.gregzanin;


public class Main {

    public static void main(String[] args) {
        boolean isAdditionsBurger[] = new boolean[10];
        boolean isAdditionsHealthyBurger[] = new boolean[10];
        boolean isAdditionsDeluxeBurger[] = new boolean[10];
        String additionsNames[] = new String[10];
        double additionsPrices[] = new double[10];

        //Additions array values
        //Names
        additionsNames[0] = "Lettuce";
        additionsNames[1] = "Tomato";
        additionsNames[2] = "Carrot";
        additionsNames[3] = "Cheddar";
        additionsNames[4] = "Onion";
        additionsNames[5] = "Bacon";
        additionsNames[6] = "Pickles";
        additionsNames[7] = "Barbecue";
        additionsNames[8] = "Chips";
        additionsNames[9] = "Drinks";

        //Prices

        additionsPrices[0] = 0.3;
        additionsPrices[1] = 0.4;
        additionsPrices[2] = 0.4;
        additionsPrices[3] = 0.8;
        additionsPrices[4] = 0.3;
        additionsPrices[5] = 0.8;
        additionsPrices[6] = 0.5;
        additionsPrices[7] = 0.6;
        additionsPrices[8] = 2.0;
        additionsPrices[9] = 2.2;

        //Default burger additions

        isAdditionsBurger[0] = true;
        isAdditionsBurger[1] = true;
        isAdditionsBurger[2] = false;
        isAdditionsBurger[3] = true;
        isAdditionsBurger[4] = false;
        isAdditionsBurger[5] = true;
        isAdditionsBurger[6] = false;
        isAdditionsBurger[7] = false;
        isAdditionsBurger[8] = false;
        isAdditionsBurger[9] = false;

        //Default burger instancing

        Additions burgerAdditions = new Additions(isAdditionsBurger,additionsNames,additionsPrices);
        Hamburger burger = new Hamburger("With Sesame", "Beef", 4, 4, burgerAdditions);

        //Healthy burger additions

        isAdditionsHealthyBurger[0] = true;
        isAdditionsHealthyBurger[1] = false;
        isAdditionsHealthyBurger[2] = false;
        isAdditionsHealthyBurger[3] = true;
        isAdditionsHealthyBurger[4] = true;
        isAdditionsHealthyBurger[5] = true;
        isAdditionsHealthyBurger[6] = true;
        isAdditionsHealthyBurger[7] = true;
        isAdditionsHealthyBurger[8] = false;
        isAdditionsHealthyBurger[9] = false;

        //Healthy burger instancing
        Additions healthyBurgerAdditions = new Additions(isAdditionsHealthyBurger,additionsNames,additionsPrices);
        HealthyBurger healthyBurger = new HealthyBurger(healthyBurgerAdditions);

        //Deluxe burger additions

        isAdditionsDeluxeBurger[0] = false;
        isAdditionsDeluxeBurger[1] = false;
        isAdditionsDeluxeBurger[2] = false;
        isAdditionsDeluxeBurger[3] = false;
        isAdditionsDeluxeBurger[4] = false;
        isAdditionsDeluxeBurger[5] = false;
        isAdditionsDeluxeBurger[6] = false;
        isAdditionsDeluxeBurger[7] = false;
        isAdditionsDeluxeBurger[8] = true;
        isAdditionsDeluxeBurger[9] = true;

        //Deluxe burger instancing

        Additions deluxeBurgerAdditions = new Additions(isAdditionsDeluxeBurger, additionsNames, additionsPrices);
        DeluxeBurger deluxeBurger = new DeluxeBurger(deluxeBurgerAdditions);



        //Default burger Testing

        System.out.println("Bread of the common burger: " + burger.getBread() +
                "\nMeat of the common burger: " + burger.getMeat());
        burger.priceList();

        //Healthy burger Testing

        System.out.println("Bread of the healthy burger: " + healthyBurger.getBread() +
                "\nMeat of the healthy burger: " + healthyBurger.getMeat());
        healthyBurger.priceList();


        //Deluxe burger Testing

        System.out.println("Bread of the deluxe burger: " + deluxeBurger.getBread() +
                "\nMeat of the deluxe burger: " + deluxeBurger.getMeat());
        deluxeBurger.priceList();

    }
}
