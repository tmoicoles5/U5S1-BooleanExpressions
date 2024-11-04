package com.codedifferently.labs.partB.ex03;

public class EqualityTestExample {
    public static String nameCheck(){
        String response = "";

        int value1 = 15;
        int value2 = 24;
        boolean res1 = value1 == 15;
        response += ("res1:" + res1);
        boolean res2 = value1 == value2;
        response += ("res2: " + res2);


        return response;

    }

    public static void main(String args[]) {
       String output = nameCheck();
        System.out.println(output);
    }
}
