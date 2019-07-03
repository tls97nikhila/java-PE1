package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumTest {
    GuessNum guessNum;
    @Before
    public void setUp(){
        guessNum= new GuessNum();
    }
    @After
    public void tearDown(){
        guessNum=null;
    }

    @Test
    public void givenLesserShouldReturnLessNum(){


        //Act
        String result= guessNum.guess(45,23);
        //Assert
        assertEquals("Number guessed less than the original",result);  //less guess
    }
    @Test
    public void givenCorrectGuessShouldReturnMatches(){


        //Act
        String result= guessNum.guess(45,45);
        //Assert
        assertEquals("Number guessed matches the original",result); // guessed more
    }
    @Test
    public void givenBigNumShouldReturnGreaterNum(){

        //Act
        String result= guessNum.guess(45,55);
        //Assert
        assertEquals("Number guessed is greater than the original",result); // guess matched
    }
    @Test
    public void giveNullforTwoInputs(){

        //Act
        String result= guessNum.guess(null,null); //input null

    }
}