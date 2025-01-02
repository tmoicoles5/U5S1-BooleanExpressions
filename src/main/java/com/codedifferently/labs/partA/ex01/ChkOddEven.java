package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class ChkOddEven {
    public static String oddEven(){
        String response = "";



        return response;
    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = in.nextInt();
        if (num < 1 || num >10){
            System.out.println("The number is out of range");
        }else {
            if (num % 2 == 0){
                System.out.println("The number " +  num  + " is even");
            }
            else{
                System.out.println("The number "+ num + " is odd");

            }
        }

    }
}
