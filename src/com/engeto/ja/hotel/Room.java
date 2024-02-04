package com.engeto.ja.hotel;

import java.math.BigDecimal;

public class Room {
    private int number;
    private int numberOfBed;
    private boolean balcony;
    private boolean seaViews;
    private BigDecimal price;

    @Override
    public String toString() {
        return  "("+
                "number:" + number +
                ", numberOfBed:" + numberOfBed +
                ", balcony:" + balcony +
                ", seaViews:" + seaViews +
                ", price:" + price +
                ')';
    }

    public Room(int number, int numberOfBed, boolean balcony, boolean seaViews, BigDecimal price) {
        this.number = number;
        this.numberOfBed = numberOfBed;
        this.balcony = balcony;
        this.seaViews = seaViews;
        this.price = price;
    }

    //region Přístupové metody
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaViews() {
        return seaViews;
    }

    public void setSeaViews(boolean seaViews) {
        this.seaViews = seaViews;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    //endregion
}
