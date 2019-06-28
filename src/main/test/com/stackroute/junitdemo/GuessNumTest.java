package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumTest {

    @Test
    public void givenLesserShouldReturnLessNum(){

        //arrange
       GuessNum guessNum= new GuessNum();

        //Act
        String result= guessNum.guess(45,23);
        //Assert
        assertEquals("Number guessed less than the original",result);
    }
    @Test
    public void givenCorrectGuessShouldReturnMatches(){

        //arrange
        GuessNum guessNum= new GuessNum();

        //Act
        String result= guessNum.guess(45,45);
        //Assert
        assertEquals("Number guessed matches the original",result);
    }
    @Test
    public void givenBigNumShouldReturnGreaterNum(){

        //arrange
        GuessNum guessNum= new GuessNum();

        //Act
        String result= guessNum.guess(45,55);
        //Assert
        assertEquals("Number guessed is greater than the original",result);
    }
}