package com.company.inheritance;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Developer> developers;

    public Company(String name){
        this.name = name;
        this.developers = new ArrayList<Developer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void recruit(Developer developer){
        this.developers.add(developer);

    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }


}
