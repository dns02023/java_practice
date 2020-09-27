package com.company.singleton;

public class singletonTest {
    public static void main(String[] args){
        Enterprise enterprise = Enterprise.getEnterprise();

        Card card1 = enterprise.createCard();
        Card card2 = enterprise.createCard();

        System.out.println(card1.getCardNum());
        System.out.println(card2.getCardNum());

    }
}
