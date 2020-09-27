package com.company.singleton;

public class Card {
    private static int serialNum = 1000;

    private int cardNum;

    public Card(){
        serialNum ++;
        this.cardNum = serialNum;
    }

    public int getCardNum() {
        return cardNum;
    }
}
