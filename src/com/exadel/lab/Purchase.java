package com.exadel.lab;

/**
 * Created by Denis on 11.02.15.
 */

public class Purchase {

    private String commodityName;
    private int price;
    private int numberUnit;

    public Purchase(){
        super();
    }

    public Purchase(String commodityName, int price, int numberUnit) {
        this.commodityName = commodityName;
        this.price = price;
        this.numberUnit = numberUnit;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberUnit() {
        return numberUnit;
    }

    public void setNumberUnit(int numberUnit) {
        this.numberUnit = numberUnit;
    }

    public int getCost(){
        return numberUnit*price;
    }

    @Override
    public String toString() {
        return commodityName + ";" + price + ";" + numberUnit + ";"
                + getCost() + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchase purchase = (Purchase) o;

        if (price != purchase.price) return false;
        if (commodityName != null ? !commodityName.equals(purchase.commodityName)
                : purchase.commodityName != null)
            return false;

        return true;
    }
}

