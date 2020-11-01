package com.productManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int doit;
        Management management = new Management();


    do{
        System.out.println("Choose an Option");
        System.out.println("1.Add Product");
        System.out.println("2.View Products");
        System.out.println("3.Sort By Price");
        System.out.println("4.Delete Product");

        choice = sc.nextInt();


        switch (choice) {
            case 1: {
                management.addProduct();
                break;
            }
            case 2: {
                management.displayProducts();
                break;
            }
            case 3:{
                management.sortAndDisplay();
                break;
            }
            case 4:{
                management.delete();
                break;
            }
            default: {
                System.out.println("please Select Valid Option");
            }
        }
        System.out.println("Do You want To continue?? 1 for yes 0 for no!!");
        doit = sc.nextInt();



        }

    while (doit==1);


    }
}
