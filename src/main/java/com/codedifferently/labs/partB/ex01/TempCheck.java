package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class TempCheck {

    public static String bool() {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Enter a number from 0-100:");
        int temp = myscan.nextInt();
        String response = "";

        if (temp <= 45) {
            System.out.println("It's cold-putting on a coat!");

        } else if (temp >= 46 && temp <= 65) {
            System.out.println("Its not bad out-a hoodie will just do fine!");
        } else {
            System.out.println("It's hot- A T-shirt will be perfect");
        }
          return response;}
        public static void main (String args[]){
            String booleanOutput = bool();
            System.out.println(booleanOutput);

        }
    }