

package com.example.yahoo.assignment2;

import org.junit.Test;

import javax.xml.validation.Validator;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class stage1Test {
    @Test
    public void addition_isCorrect() {
        assertEquals(1,com.example.yahoo.assignment2.Validator.Stage1("PasSwoRd"));
        assertEquals(1,com.example.yahoo.assignment2.Validator.Stage1("password"));
        assertEquals(1,com.example.yahoo.assignment2.Validator.Stage1("pass"));
        assertEquals(2,com.example.yahoo.assignment2.Validator.Stage1("123123123"));
    }
}