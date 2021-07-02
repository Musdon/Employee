package com.company;

public class Invoice implements Payable{
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        if (quantity<0){
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (pricePerItem<0){
            throw new IllegalArgumentException("Price of item cannot be negative");
        }
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    public String getPartNumber(){
        return partNumber;
    }
    public String getPartDescription(){
        return partDescription;
    }
    public void setQuantity(int quantity){
        if (quantity<0){
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem<0){
            throw new IllegalArgumentException("Price of item cannot be negative");
        }
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    @Override
    public String toString(){
        return String.format("Part Number: %s\nQuantity: %d\nPrice per Item: %.2f",getPartNumber(),  getQuantity(), getPricePerItem());
    }
    @Override
    public double getPaymentAmount(){
         return getQuantity() * getPricePerItem();
    }
}
