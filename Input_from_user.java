package com.company;

//Scanner package
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int num;
        float num2;
        String name;

//        Here we are creating variable to store the number
//        Taking Input from the user
        Scanner sc=new Scanner(System.in);   // system.in it takes the input=>  :it can take input from anywhere
        System.out.println("Enter the Number: ");
        num = sc.nextInt(); //It takes the input and stored in the num variable
        System.out.println("The number is :"+num);

//        For Float number

        System.out.println("Enter the Float Number: ");
        num2 = sc.nextFloat(); //It takes the input and stored in the num variable

        sc.nextLine(); //must

        System.out.println("The number is :"+num2);

//        For String
        System.out.println("Enter Your Name: ");
        name = sc.nextLine(); //It takes the input and stored in the num variable
        System.out.println("Your  name is :"+name);

    }

//    The other things are :
//    Float => nextFloat(); For Float numbers;
//    nextLine() it is used for a String;


//    Bufferd Reader

}
