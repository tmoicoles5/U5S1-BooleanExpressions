package com.codedifferently.labs.partB.ex03;

import java.util.Scanner;

public class IfElseNameCheck {
    public static String nameCheck(String name){
        Scanner myscan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNumber= myscan.nextInt();
        String response = "";
        /* Put your code in between these comments : Top */
        if (userNumber==7){
            System.out.println("That's lucky!");
        }else {
            System.out.println("That's unlucky!");
        }
        /* Put your code in between these comments : Bottom */
        return response;

    }

    public static void main(String args[]) {
        String name = "";
        /* Put your code in between these comments : Top */


        /* Put your code in between these comments : Bottom */


        String responseToName  = nameCheck(name);
        System.out.println(responseToName);
    }

}
