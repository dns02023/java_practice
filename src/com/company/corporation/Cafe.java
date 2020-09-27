package com.company.corporation;

public class Cafe {
    private String name;
    private int income;

    public Cafe(String name, int income){
        this.name = name;
        this.income = income;
    }

    public int getIncome(){
        return this.income;
    }
    public String getName(){
        return this.name;
    }

    public void sellCoffee(int money){
        this.income = this.income + money;
    }



}
