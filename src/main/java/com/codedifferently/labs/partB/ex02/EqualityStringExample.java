package com.codedifferently.labs.partB.ex02;

public class EqualityStringExample {
    public static String equality(){
        String response = "";

        String name1 = "Fred Smith";
        String name2 = "Sam Smith";

        if (name1.equals(name2)) {
            response+= ("Same name.");
        } else {
            response+= ("Different name.");
        }

        return response;
    }
    public static void main(String args[]) {
        String equalityOutput = equality();
        System.out.print(equalityOutput);
    }
}
