package com.company;

import java.util.Scanner;

public class Employee {

    Scanner sc= new Scanner(System.in);
    public String name;
    public int age;

//    functions
  public void getDetails(){
      System.out.println("Enter the user name");
      name = sc.nextLine();
      System.out.println("Enter the Age of the user");
      age = sc.nextInt();
  }

  public void displayDetails(){
      System.out.println("The name is " +name+"And the Age is :"+age);

  }


}
