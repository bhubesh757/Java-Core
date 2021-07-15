package com.company;

//Scanner package

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        constructor?
//        the classname and function or contructor names are always same
        Employee e = new Employee();

        e.getDetails();
//        Here we are trying to do the data hiding!

//        e.name = "Bhubesh";
        e.displayDetails();
        e.setAge(45);
        System.out.println(e.getAge());

    }
}


