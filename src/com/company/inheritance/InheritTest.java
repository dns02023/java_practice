package com.company.inheritance;

import java.util.ArrayList;


public class InheritTest {

    public static void main(String[] args){
        WebDeveloper mark = new WebDeveloper("Mark", 27);
        Developer kim = new Developer("Kim", 26);
        VisionDeveloper kwon = new VisionDeveloper("Kwon", 24);

        CommerceCompany kakao = new CommerceCompany("KAKAO");

        ArrayList<Developer> people = new ArrayList<Developer>();
        people.add(mark);
        people.add(kim);
        people.add(kwon);

        InheritTest test = new InheritTest();
        // 다형성 테스트를 위해 생성
        test.selfIntroduce(people);

        mark.getJob(kakao);
        mark.showInfo();
        ArrayList<Developer> crews = kakao.getDevelopers();
        for(Developer crew : crews){
            System.out.println(crew.getName());
        }

        //kim = mark;
        // Developer는 WebDeveloper의 상위클래스이므로 형변환이 묵시적으로 가능함, 업캐스팅
        //kim.showInfo();

        //Developer park = new WebDeveloper("Park", 28);
        // 이때 park은 Web Developer로 생성을 했지만, 타입이 Developer이므로, job, salary와 같은 메모리에 접근 못한다.

        // 하지만 만약 WebDeveloper에서 override하여 재정의한 메서드가 있다면 park에서 호출 시, 타입이 아니라 인스턴스 기준으로
        // 재정의된 메서드 메모리를 호출하기 때문에 재정의된 메서드를 사용한다 => 가상 메서드
        // 재정의되면 서로 다른 메모리, 재정의되지 않으면 같은 메모리를 가리킨다.

        // 다운 캐스팅
//        if(park instanceof WebDeveloper){
//            WebDeveloper webDeveloper_park = (WebDeveloper) park;
//            webDeveloper_park.getJob(kakao);
//            webDeveloper_park.showInfo();
//        }

        // Staff 타입으로 생성 => work or rest만 사용가능 => WebDeveloper 인스턴스인 jay에게 work를 호출하면 WebDeveloper의 work를 호출
        Staff jay = new WebDeveloper("Jay", 28);
        jay.work();
    }

    // 다형성 테스트 : 각 Developer 클래스의 하위 클래스의 각기 다르게 구현된 Override 메서드 출력을 확인
    public void selfIntroduce(ArrayList<Developer> people){
        for(Developer developer : people){
            developer.introduceMy();
            // 타입은 Developer지만 override 메서드 호출시 인스턴스의 메서드를 호출하므로, 하위클래스 마다 다른 출력이 나타남 => 가상 메서드
        }
    }




}
