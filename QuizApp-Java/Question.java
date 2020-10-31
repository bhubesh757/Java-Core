package com.company;

import java.util.Scanner;

public class Question {

    Scanner sc = new Scanner(System.in);

    String question, opt1, opt2, opt3, opt4;
    int correctAns , userAns;

    public boolean askQuestion(){

        System.out.println(question);
        System.out.println("1. "+ opt1);
        System.out.println("2. "+ opt2);
        System.out.println("3. "+ opt3);
        System.out.println("4. "+ opt4);

        System.out.println("Please Choose one option");

        userAns = sc.nextInt();


        if(userAns == correctAns) {

            return true;

        }
        return false;
    }
}