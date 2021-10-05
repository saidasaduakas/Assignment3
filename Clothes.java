package com.company;

public class Clothes extends ShopDecorator{
    public Clothes(Purchase purchase){
        super(purchase);
    }
    String seeCloth(){
        return "I am seeing clothes. ";
    }
    @Override
    public String getPurchase(){
        return super.getPurchase()+seeCloth();
    }
}
