package com.company.inheritance;

import java.util.ArrayList;

public class CommerceCompany extends Company{

    public CommerceCompany(String name){
        super(name);
    }


    // Override를 하려면 받는 매개변수 인자도 동일해야한다.
    // 다르면 override메서드가 아니라 그냥 하위클래스만 가진 별개의 메서드가 되버림
    // 즉, 이름만 같다고 해서 override 메서드가 아님 => 선언부가 모두 동일해야함
    // 이러한 부분이 헷갈릴 수 있으므로 @Override를 사용해서 컴파일 에러를 막을 수 있음
    // override 조건을 만족하지 않는데 노테이션을 쓰면 에러가 나므로, 미리 알 수 있다.
    @Override
    public void recruit(Developer developer) {
        super.recruit(developer);
    }
}
