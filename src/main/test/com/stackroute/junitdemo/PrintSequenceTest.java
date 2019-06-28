package com.stackroute.junitdemo;

import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class PrintSequenceTest {
    @Test
    public void givenNumShouldReturnSequence(){
       //arrange
        PrintSequence printSequence=new PrintSequence();
        //Act
        String result= printSequence.print(5);
        //Assert
        assertEquals("122333444455555",result);

    }

    @Test
    public void givenNumShouldReturnSequence1(){
        //arrange
        PrintSequence printSequence=new PrintSequence();
        //Act
        String result= printSequence.print(-1);
        //Assert
        assertEquals("Wrong Format",result);

    }

    @Test
    public void givenNumShouldReturnSequence3(){
        //arrange
        PrintSequence printSequence=new PrintSequence();
        //Act
        String result= printSequence.print(3);
        //Assert
        assertEquals("122333",result);

    }

}