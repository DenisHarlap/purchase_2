package com.exadel.lab;

/**
 * Created by Denis on 11.02.15.
 */
public class GoodPurchase extends Purchase {
    private double discountPercent;
    private final int LEVEL_UNIT = 30;

    public GoodPurchase (){}

    public GoodPurchase(String commodityName, int price, int numberUnit, double discountPercent) {
        super(commodityName, price, numberUnit);
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public int getCost() {
        if (this.getNumberUnit() > LEVEL_UNIT)
            return (int)(super.getCost()*(1 - discountPercent/100));
        else
            return super.getCost();
    }
}
