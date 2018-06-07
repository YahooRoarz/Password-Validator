package com.example.yahoo.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;

public class Validator{
    public static int Stage3(String input) {
        int rule = 0;

        if(input.length()>=8){
            //length is greater than 8
            rule++;
        }

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