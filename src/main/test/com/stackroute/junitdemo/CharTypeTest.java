package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharTypeTest {

    @Test
    public void givenIntegerCharShouldReturnNumber() {
        //arrange
        CharType charType = new CharType();
        //Act
        String result = charType.type('7');
        //Assert
        assertEquals("Number", result);
    }

    @Test
    public void givenSpecialCharShouldReturnSpecial() {
        //arrange
        CharType charType = new CharType();
        //Act
        String result = charType.type('@');
        //Assert
        assertEquals("Special Char", result);
    }

    @Test
    public void givenCapitalCharShouldReturnCapital() {
        //arrange
        CharType charType = new CharType();
        //Act
        String result = charType.type('A');
        //Assert
        assertEquals("Capital Letter", result);
    }
}



