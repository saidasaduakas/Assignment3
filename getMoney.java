package com.company;

public class getMoney extends  ShopDecorator{
    public  getMoney(Purchase purchase){
        super(purchase);
    }
    public String purchaseMoney(){
        return  "I am buying by money. ";
    }
    @Override
    public String getPurchase(){
        return  super.getPurchase()+purchaseMoney();
    }
}
