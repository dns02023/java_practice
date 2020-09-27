package com.company.corporation;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public int getMoney(){
        return this.money;
    }

    public String getName(){
        return this.name;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public void buyCoffee(Cafe cafe, int money){
        cafe.sellCoffee(money);
        this.money = this.money - money;
    }




}
