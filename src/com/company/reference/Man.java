package com.company.reference;

public class Man {
    public String name;
    int age;
    Course course1;
    Course course2;

    public Man(String name){
        this.name = name;
        course1 = new Course(1, "java");
        course2 = new Course(1, "C++");
    }

    public void setCourse1Score(int score){
        course1.score = score;
    }
    public void setCourse2Score(int score){
        course2.score = score;
    }
    public void showTotalScore(){
        System.out.println(name + " : " + (course1.score + course2.score));
    }


}
