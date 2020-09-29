package com.company.inheritance;

import java.util.ArrayList;

public class InheritTest {
    public static void main(String[] args){
        WebDeveloper mark = new WebDeveloper("Mark", 27);
        Developer kim = new Developer("Kim", 26);
        VisionDeveloper kwon = new VisionDeveloper("Kwon", 24);

        CommerceCompany kakao = new CommerceCompany("KAKAO");
        mark.getJob(kakao);
        mark.showInfo();
        ArrayList<Developer> crews = kakao.getDevelopers();
        for(Developer crew : crews){
            System.out.println(crew.getName());
        }

    }


}
