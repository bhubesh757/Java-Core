package com.productManagement;

import java.util.Scanner;

public class Management {
    Scanner sc = new Scanner(System.in);
    Product[] products = new Product[5];
    int noofproducts = 0;
    int count = 0;

    Management() {
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();

        }
    }

    public void addProduct() {

        int i = 0;
        int choice;
        do {
            products[noofproducts].createProduct();
            noofproducts++;
            System.out.println(" do u want to add one more?.. press 1 to add .. or press 0 to exit!!");
            choice = sc.nextInt();
        }
        while (choice == 1);
    }

    public void  delete(){
        System.out.println("Enter the Product you want to Delete");
        String name = sc.next();

        if (count!= 0) {

            for (int i = 0; i < noofproducts; i++) {

                if(products[i].getName().equals(name)){
                    products[i].setDeleted(true);


                }
            }
        } else {
            System.out.println("You have 0 Products");
        }
    }

    public void displayProducts() {

        for (int i = 0; i < noofproducts; i++) {

            products[i].displayProduct();

        }

    }

    public void sortAndDisplay() {

        Product tempProduct;
        if (count!= 0) {

            for (int i = 0; i < noofproducts; i++) {
                for (int j = i + 1; j < noofproducts; j++) {

                    if (products[i].getPrice() < products[j].getPrice()) {

                        tempProduct = products[i];
                        products[i] = products[j];
                        products[j] = tempProduct;
                    }

                }

            }
            for(int i=0;i<noofproducts;i++){
                if(products[i].getDeleted()==false) {
                    products[i].displayProduct();
                }
            }
        } else {
            System.out.println("You have 0 Products");
        }
    }
}

