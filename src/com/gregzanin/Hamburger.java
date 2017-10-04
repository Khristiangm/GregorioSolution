package com.gregzanin;

import java.text.DecimalFormat;

/**
 * Created by GR389658 on 25/09/2017.
 */
public class Hamburger {
    private String bread;
    private String meat;
    private double burgerPrice;
    private int itemsCurrent;
    private int itemsTotal;
    private Additions additions;
    //Always shows 2 decimal numbers:
    private DecimalFormat df = new DecimalFormat("0.00");


    //Constructor
    public Hamburger(String bread, String meat, double burgerPrice, int itemsTotal, Additions additions) {
        this.bread = bread;
        this.meat = meat;
        this.burgerPrice = burgerPrice;
        this.itemsTotal = itemsTotal;
        this.additions = additions;
    }

    public void priceList() {
        double totalPrice = burgerPrice;
        String priceListMessage = "The price of the burger and its additions are as following: \n" +
                "Hamburger: $" + df.format(burgerPrice);
        for(int i=0; i<=9; i++){
            if (itemsCurrent == itemsTotal){
                break;
            }
            if (additions.isAdditions(i)){
                totalPrice += additions.getAdditionsPrices(i);
                priceListMessage += "\n" + additions.getAdditionsNames(i) + ": $" + df.format(additions.getAdditionsPrices(i));
                itemsCurrent ++;
            }
        }
        priceListMessage += "\n------------------------------------------------------------" +
                "\nTotal value: $" + df.format(totalPrice) + "\n";
        System.out.println(priceListMessage);
    }

    //Getters and Setters
    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }


}
