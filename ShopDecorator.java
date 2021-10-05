package com.company;

public class ShopDecorator implements Purchase{
    private Purchase purchase;
    public ShopDecorator(Purchase purchase){
        this.purchase=purchase;
    }
    @Override
    public String getPurchase(){
        return purchase.getPurchase();
    }
}
