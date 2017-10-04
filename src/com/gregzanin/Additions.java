package com.gregzanin;

/**
 * Created by GR389658 on 25/09/2017.
 */
public class Additions {
    private boolean isAdditions[] = new boolean[10];
    private String additionsNames[] = new String[10];
    private double additionsPrices[] = new double[10];

    public Additions(boolean[] haveAdditions, String[] additionsNames, double[] additionsPrices) {
        this.isAdditions = haveAdditions;
        this.additionsNames = additionsNames;
        this.additionsPrices = additionsPrices;
    }

    public boolean isAdditions(int i) {
        return isAdditions[i];
    }

    public String getAdditionsNames(int i) {
        return additionsNames[i];
    }

    public double getAdditionsPrices(int i) {
        return additionsPrices[i];
    }
}
