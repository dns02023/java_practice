package com.company.inheritance;

public class WebDeveloper extends Developer implements Staff{

    public WebDeveloper(String name, int age){
        // 하위 클래스에서의 super는 자신의 상위 클래스의 메모리 공간?을 지칭한다.
        super(name, age);
        // 하위 클래스에서 생성자를 호출할때 무조건 먼저 상위 클래스 생성자를 호출한다. => super(), 생략만 되있을 뿐 자동으로 호출됨
        // 즉, 이 상황에서 상위 클래스에 디폴트 생성자가 없으면(매개변수 생성자만 존재한다면) super()를 호출 할 수 없으므로,
        // 매개변수 생성자가 있다면 super(매개변수) 형태로 상위클래스를 명시적으로 호출해야 함
        this.specialty = "Web Development";
    }

    @Override
    public void showInfo(){
        System.out.println("Web Developer: " + this.getName() + this.getAge() + this.getSpecialty() + this.job.name);
    }

    @Override
    public void introduceMy() {
        System.out.println("I'm good at " + this.specialty);
    }

    @Override
    public void work() {
        System.out.println("I'm working with Spring");
    }

    @Override
    public void rest() {
        System.out.println("I'm in vacation");
    }
}
