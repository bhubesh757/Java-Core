package com.company;

//Scanner package
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        Looping statements
//        Keyword used for looping statements
//        While , Do while , For loop
//       syntax
//        loop(cndn){
//
//        }
//        While loop // also called as entry controlled loop!
        int num = 1;

        while (num < 10) {
            System.out.println("Hey i am Loop");
            num = num + 1; //= num++
//            break; //break is must in looping statements
        }

//        do while loop
//        syntax
//        do{
//    }
//        while(cndn){
//    }

//        here we dont check the first num ! it prints and check the statement!

        do {
            System.out.println("Hey Buddy , I am Do while loop");
            num++;
        }
        while (num>10);
//        if even wrong it executes the statement atleast once! even though it is wrong

//        For loop
        for (int num=1 ;num<10;num++){
            System.out.println("Hi i am For loop! ");
        }

    }
}

//loop

//=> It repeats  itself again and again;

