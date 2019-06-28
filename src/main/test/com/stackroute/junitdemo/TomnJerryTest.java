package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomnJerryTest {
    @Test
    public void givenNumShouldReturnResult(){
        //arrange
       TomnJerry tomnJerry=new TomnJerry();
        //Act
        String result= tomnJerry.findMe(5);
        //Assert
        assertEquals("Out of bounds",result);

    }
    @Test
    public void givenNumShouldReturnResultJerry(){
        //arrange
        TomnJerry tomnJerry=new TomnJerry();
        //Act
        String result= tomnJerry.findMe(21);
        //Assert
        assertEquals("Jerry",result);

    }

    @Test
    public void givenNumShouldReturnResultTom(){
        //arrange
        TomnJerry tomnJerry=new TomnJerry();
        //Act
        String result= tomnJerry.findMe(28);
        //Assert
        assertEquals("Tom",result);

    }


}