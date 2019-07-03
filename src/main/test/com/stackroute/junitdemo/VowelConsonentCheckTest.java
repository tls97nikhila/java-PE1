package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonentCheckTest {
    VowelConsonentCheck vowelConsonentCheck;
    @Before
    public void setUp(){
        vowelConsonentCheck=new VowelConsonentCheck();
    }
    @After
    public void tearDown(){
        vowelConsonentCheck=null;
    }
    @Test
    public void givenStringShouldReturnConsonentVowels(){
        //arrange

        //Act
        String result= vowelConsonentCheck.check("av");
        //Assert
        assertEquals("vowel consonant ",result); // correct input
    }

    @Test
    public void givenStringnumberShouldReturnwrong(){
        //arrange

        //Act
        String result= vowelConsonentCheck.check("1");
        //Assert
        assertEquals("wrong format ",result);  // wrong input 1
    }
    @Test
    public void givenStringnumberShouldReturnwrong1(){
        //arrange

        //Act
        String result= vowelConsonentCheck.check(" ");  // wrong input 2
        //Assert
        assertEquals("wrong format ",result);
    }

    @Test
    public void givenStringnumberShouldReturnwrong2(){
        //arrange

        //Act
        String result= vowelConsonentCheck.check("@"); // wrong test case 3
        //Assert
        assertEquals("wrong format ",result);
    }

}