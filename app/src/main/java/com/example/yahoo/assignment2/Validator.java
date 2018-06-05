package com.example.yahoo.assignment2;

public class Validator {
    public static int Stage1(String input) {
        int rule = 0;

        for(int i = 0; i<input.length();i++) {//check if you have a uppercase letter
            if (input.charAt(i)>='A' && input.charAt(i)<='Z') {
                rule++;
                break;
            }
        }

        for(int i = 0; i<input.length();i++) {//check if you have a numeric
            if (Character.getNumericValue(input.charAt(i))>=0 && Character.getNumericValue(input.charAt(i))<=9) {
                rule++;
                break;
            }
        }

        for(int i = 0; i<input.length();i++) {//check if you have a special character
            if (SpecialChar(input.charAt(i))) {
                rule++;
                break;
            }
        }


        return rule;
    }

    public static boolean SpecialChar(char c) {//this a method to check special character
        switch (c) {
            case '!':
            case '@':
            case '#':
            case '$':
            case '%':
            case '^':
            case '&':
            case '-':
            case '+':
            case '=':
            case '?':
            case '/':
                return true;
            default:
                return false;
        }
    }
}