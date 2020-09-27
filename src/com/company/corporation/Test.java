package com.company.corporation;

public class Test {
    public static void main(String[] args){
        Person tomas  = new Person("Tomas", 10000);
        Person james = new Person("James", 9000);

        Cafe starbucks = new Cafe("Starbucks", 0);
        Cafe twosome = new Cafe("Twosome", 0);

        tomas.buyCoffee(starbucks, 4000);
        james.buyCoffee(twosome, 4500);

        System.out.println(tomas.getMoney());
        System.out.println(james.getMoney());
        System.out.println(starbucks.getIncome());
        System.out.println(twosome.getIncome());

        tomas.setMoney(12000);
        System.out.println(tomas.getMoney());




    }



}
