package com.company.inheritance;

public class InheritTest {
    public static void main(String[] args){
        WebDeveloper mark = new WebDeveloper("Mark", 27);
        Developer kim = new Developer("Kim", 26);
        VisionDeveloper kwon = new VisionDeveloper("Kwon", 24);

        CommerceCompany kakao = new CommerceCompany("KAKAO");
        mark.getJob(kakao);
        mark.showInfo();

    }


}
