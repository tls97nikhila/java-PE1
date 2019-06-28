package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonentCheckTest {

    @Test
    public void givenStringShouldReturnConsonentVowels(){
        //arrange
        VowelConsonentCheck vowelConsonentCheck=new VowelConsonentCheck();
        //Act
        String result= vowelConsonentCheck.check("av");
        //Assert
        assertEquals("vowel consonant ",result);
    }

    @Test
    public void givenStringnumberShouldReturnwrong(){
        //arrange
        VowelConsonentCheck vowelConsonentCheck=new VowelConsonentCheck();
        //Act
        String result= vowelConsonentCheck.check("1");
        //Assert
        assertEquals("wrong format ",result);
    }
    @Test
    public void givenStringnumberShouldReturnwrong1(){
        //arrange
        VowelConsonentCheck vowelConsonentCheck=new VowelConsonentCheck();
        //Act
        String result= vowelConsonentCheck.check("@");
        //Assert
        assertEquals("wrong format ",result);
    }

}