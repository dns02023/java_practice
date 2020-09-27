package com.company.inheritance;

public class InheritTest {
    public static void main(String[] args){
        WebDeveloper mark = new WebDeveloper("Mark", 27);
        Developer kim = new Developer("Kim", 26);
        VisionDeveloper kwon = new VisionDeveloper("Kwon", 24);
        mark.showInfo();
        kwon.showInfo();
        kim.showInfo();
        kim.setSpecialty("Infra");
        kim.showInfo();
    }


}
