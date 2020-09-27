package com.company;

public class Main {

    public static void main(String[] args) {
//        Man man = new Man("James");
//        man.setAge(40);
//        man.setChildren(3);
//        man.setMarriage(true);
//        man.printInfo();

        com.company.reference.Man mark = new com.company.reference.Man("Mark");
        com.company.reference.Man marie = new com.company.reference.Man("Marie");
        // Man 클래스는 서로 다른 패키지에 정의 되면 서로 완전히 다른 클래스임
        mark.setCourse1Score(90);
        mark.setCourse2Score(100);
        marie.setCourse1Score(80);
        marie.setCourse2Score(95);

        mark.showTotalScore();
        marie.showTotalScore();

        //System.out.println(mark.name);
        // reference패키지에서 정의된 Man 클래스의 디폴트 변수들은 다른 패키지에서 접근할 수가 없음 => public으로 열면 가능
        // 또는 Man 클래스에 public get, set 메소드를 정의해서 접근





    }
}
