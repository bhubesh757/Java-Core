package com.company;

//Scanner package

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Looping statements
//        Keyword used for looping statements
//        While , Do while , For loop
//       syntax
//        loop(cndn){
//
////        }
////        While loop // also called as entry controlled loop!
//        int num = 1;
//
//        while (num < 10) {
//            System.out.println("Hey i am Loop");
//            num = num + 1; //= num++
////            break; //break is must in looping statements
//        }
//
////        do while loop
////        syntax
////        do{
////    }
////        while(cndn){
////    }
//
////        here we dont check the first num ! it prints and check the statement!
//
//        do {
//            System.out.println("Hey Buddy , I am Do while loop");
//            num++;
//        }
//        while (num>10);
////        if even wrong it executes the statement atleast once! even though it is wrong
//
////        For loop
//        for (int num=1 ;num<10;num++){
//            System.out.println("Hi i am For loop! ");
//        }

//        How to print string and int together?
//        concatination
//        String name = "SpiderMan";
//        int age = 47;
//
//        System.out.println("The name is :" +name );
//        System.out.println(name+"'s age is :" +age );

//        System.out.println("Enter the name");
//        String name = sc.next();
//        System.out.println("enter the age");
//        int age = sc.nextInt();
//
//        System.out.println(name);
//        System.out.println(age);
//        Arrays
//        Collection of elements/data of same type:

//        syntax
//        datatype[] arr = new datatype [size]
        int[] num = new int[3]; // the empty array stores the array
//        here we are storing the 3 numbers in the form of array and we are giving the numbers!
//        num[0]=78;
//        num[1]=47;
//        num[2]=9;

//        array with loops

        for(int i=0 ;i<3;i++ ) {
//            System.out.println(i);
//            num[i]=50;
//            taking input from the user
            System.out.println("Enter the number");
            num[i]=sc.nextInt();
        }

        for(int i=0 ;i<3;i++ ) {
            System.out.println(num[i]);
        }






//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);

    }
}

//loop

//=> It repeats  itself again and again;

