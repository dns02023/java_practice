package com.company.singleton;

public class Enterprise {
    private static Enterprise enterprise = new Enterprise();
    private Enterprise(){ }

    public Card createCard(){
        Card card = new Card();
        return card;
    }

    public static Enterprise getEnterprise() {
        return enterprise;
    }
}
