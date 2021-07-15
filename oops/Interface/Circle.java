package com.company;

public class Circle implements Shape{

//    the implement forces to make overriding on the implement
    private float r = 4f;

    public void area(){
        float area = 2*pi*r*r;
        System.out.println(area);
    }
}
