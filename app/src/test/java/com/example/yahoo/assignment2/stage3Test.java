

package com.example.yahoo.assignment2;

import org.junit.Test;

import javax.xml.validation.Validator;

import static org.junit.Assert.*;

public class stage3Test {
    @Test
    public void addition_isCorrect() {
        assertEquals(0,com.example.yahoo.assignment2.Validator.Stage3("<>"));
        assertEquals(2,com.example.yahoo.assignment2.Validator.Stage3("YahuWang"));
        assertEquals(1,com.example.yahoo.assignment2.Validator.Stage3("123"));
        assertEquals(1,com.example.yahoo.assignment2.Validator.Stage3("!@#"));
        assertEquals(3,com.example.yahoo.assignment2.Validator.Stage3("YahuWang123"));
        assertEquals(3,com.example.yahoo.assignment2.Validator.Stage3("YahuWang#$%^"));
        assertEquals(3,com.example.yahoo.assignment2.Validator.Stage3("123#$%^&"));
        assertEquals(4,com.example.yahoo.assignment2.Validator.Stage3("YahuWang123@!"));
    }
}