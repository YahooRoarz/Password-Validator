

package com.example.yahoo.assignment2;

import org.junit.Test;

import javax.xml.validation.Validator;

import static org.junit.Assert.*;

public class stage2Test {
    @Test
    public void addition_isCorrect() {
        assertEquals(0,com.example.yahoo.assignment2.Validator.Stage2("<>"));
        assertEquals(1,com.example.yahoo.assignment2.Validator.Stage2("YahuWang"));
        assertEquals(1,com.example.yahoo.assignment2.Validator.Stage2("123"));
        assertEquals(1,com.example.yahoo.assignment2.Validator.Stage2("!@#"));
        assertEquals(2,com.example.yahoo.assignment2.Validator.Stage2("YahuWang123"));
        assertEquals(2,com.example.yahoo.assignment2.Validator.Stage2("YahuWang#$%^"));
        assertEquals(2,com.example.yahoo.assignment2.Validator.Stage2("123#$%^&"));
        assertEquals(3,com.example.yahoo.assignment2.Validator.Stage2("YahuWang123@!"));
    }
}