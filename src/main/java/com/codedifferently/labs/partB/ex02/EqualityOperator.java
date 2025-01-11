package com.codedifferently.labs.partB.ex02;

public class EqualityOperator {
    public static String numEquality() {
        String response = "";
        String num1 = "4";
        String num2 = "4";
        String num3 = "5";

        /* Your code goes here*/
        if (num1.equals(num1)) {
            response += "Are " + num1  + " and " + num2 + " equal? " + (num1==num2)+ "\n";
        } else {
            response += "Are " + num1 + " and " + num2 + " equal? " + (num2 ==num1);
            ;
        }
        if (num1.equals(num3)){
            response+= "Are " + num1 + " and " + num3 + " equal? true";
        }else
    response+= "Are " + num1 + " and " + num3 + " equal? false";

        return response;
    }

    public static void main(String args[]) {
        String equalityOutput = numEquality();
        System.out.print(equalityOutput);
    }
}
