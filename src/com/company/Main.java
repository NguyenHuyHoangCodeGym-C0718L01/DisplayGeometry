package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Rectangle");
        System.out.println("2-Square Triangle - Bottom Left");
        System.out.println("3-Square Triangle - Top Left");
        System.out.println("4-Isosceles Triangle");
        System.out.print("Input choice: ");
        choice = scanner.nextInt();

        switch (choice){
            case 1:{
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 4; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            case 2:{
                for(int i = 0; i < 5; i++){
                    for(int j = 0; j <= i ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            case 3:{
                for(int i=0; i<5; i++){
                    System.out.println();
                    for(int j = 4; j > i; j--){
                        System.out.print("*");
                    }
                }
                break;
            }
            case 4:{
                for(int i = 1; i < 6; i++){
                    for(int j = 1; j <=i && j <=(6-i) ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            default:{
                System.out.println("Wrong input");
                break;
            }
        }
    }
}
