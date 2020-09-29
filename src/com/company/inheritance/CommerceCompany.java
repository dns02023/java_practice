package com.company.inheritance;

import java.util.ArrayList;

public class CommerceCompany extends Company{

    public CommerceCompany(String name){
        super(name);
    }

    @Override
    public void recruit(Developer developer) {
        super.recruit(developer);
    }
}
