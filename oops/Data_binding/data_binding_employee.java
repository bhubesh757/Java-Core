package com.company;

import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);

    private String name ;
    private int age ;

//    getter funciton
    public int getAge(){
        return age;
    }
// setter function
    public void setAge(int a ){
        age = a;
    }
//    data binding
//    setter function

//    for constructor
//    Employee(){
//        System.out.println("I am  The Constructor");
//    }
//    getting the details from the user

    public void getDetails()
    {
        System.out.println("Enter the name and Age");
        name = sc.next();
//        age = sc.nextInt();

    }


    public void displayDetails(){

        System.out.println(name+" "+age);
    }

//    parameters
//    passing the data to the functions while calling them
//    eample
//    Mutiple parameters and also called as the methods
//    public void printSomething(String animal ,int age){
//        System.out.println(animal+" "+age);


}
