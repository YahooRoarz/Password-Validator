package com.example.yahoo.assignment2;

public class Validator {
    public static int Stage1(String input) {
        int rule = 0;
        if(!(input.equalsIgnoreCase("password")))
            //it is not “password” (case insensitive)
            rule++;

        if(input.length()>=8){
            //length is greater than 8
            rule++;
        }
        return rule;
    }
}