package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharTypeTest {
    CharType charType;

    @Before
    public void setUp() {
        charType = new CharType();
    }

    @After
    public void tearDown() {
        charType = null;
    }

    @Test
    public void givenIntegerCharShouldReturnNumber() {

        //Act
        String result = charType.type('7');
        //Assert
        assertEquals("Number", result);   // number test case
    }

    @Test
    public void givenSpecialCharShouldReturnSpecial() {

        String result = charType.type('@');
        //Assert
        assertEquals("Special Char", result);  // Special Chat test Case
    }

    @Test
    public void givenCapitalCharShouldReturnCapital() {

        String result = charType.type('A');
        //Assert
        assertEquals("Capital Letter", result);  // Capital Letter


    }
    @Test
    public void givenSmallCharShouldReturnSmall() {

        String result = charType.type('a');
        //Assert
        assertEquals("Small Letter", result);  // small Letter


    }
}
