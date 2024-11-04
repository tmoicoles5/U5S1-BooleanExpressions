package com.codedifferently.labs.partB.ex04;

public class IfDemo {

    public static String drivingAge(){
        String response = "";

        boolean drivingUnderAge;

        int age = 15;

        if (age <= 16) {
            drivingUnderAge = true;
            response += ("Was Driving Under Age: " + drivingUnderAge);
        }

        return response;
    }

    public static void main(String args[]) {
        String drivingOutput = drivingAge();
        System.out.println(drivingOutput);


    }
}
