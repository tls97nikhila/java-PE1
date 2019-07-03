package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomnJerryTest {
    TomnJerry tomnJerry;
    @Before
    public void setUp(){
       tomnJerry=new TomnJerry();
    }
    @After
    public void tearDown(){
        tomnJerry = null;
    }
    @Test
    public void givenNumShouldReturnResult(){
        //arrange

        //Act
        String result= tomnJerry.findMe(-1);
        //Assert
        assertEquals("Out of bounds",result); // out of bounds

    }
    @Test
    public void givenNumShouldReturnResultJerry(){
        //arrange

        //Act
        String result= tomnJerry.findMe(21);
        //Assert
        assertEquals("Jerry",result);  // jerry test case

    }

    @Test
    public void givenNumShouldReturnResultTom(){
        //arrange

        //Act
        String result= tomnJerry.findMe(28);
        //Assert
        assertEquals("Tom",result); // tom test case

    }
    @Test
    public void givenNumShouldReturnResultwrong(){
        //arrange

        //Act
        String result= tomnJerry.findMe(90);
        //Assert
        assertEquals("Out of bounds",result); // out of bounds

    }


}