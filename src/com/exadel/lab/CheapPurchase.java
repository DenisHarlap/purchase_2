package com.exadel.lab;

/**
 * Created by Denis on 11.02.15.
 */
public class CheapPurchase extends Purchase{
    private int unitDiscount;

    public CheapPurchase (){}

    public CheapPurchase(String commodityName, int price, int numberUnit, int unitDiscount) {
        super(commodityName, price, numberUnit);
        this.unitDiscount = unitDiscount;
    }

    public int getUnitDiscount() {
        return unitDiscount;
    }

    @Override
    public int getCost() {
        return (this.getPrice() - unitDiscount)*this.getNumberUnit();
    }

}
