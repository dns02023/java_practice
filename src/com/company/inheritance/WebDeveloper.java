package com.company.inheritance;

public class WebDeveloper extends Developer{

    public WebDeveloper(String name, int age){
        super(name, age);
        this.setSpecialty("Spring");
    }
}
