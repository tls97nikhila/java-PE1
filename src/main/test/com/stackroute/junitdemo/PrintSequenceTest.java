package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class PrintSequenceTest {
    PrintSequence printSequence;
    @Before
    public void setUp(){
        printSequence=new PrintSequence();
    }
    @After
    public void tearDown(){
        printSequence=null;
    }
    @Test
    public void givenNumShouldReturnSequence(){

        //Act
        String result= printSequence.print(5);
        //Assert
        assertEquals("122333444455555",result);  // positive test Case 1

    }

    @Test
    public void givenNumShouldReturnSequence1(){

        //Act
        String result= printSequence.print(-1);
        //Assert
        assertEquals("Wrong Format",result);  // negative test case

    }


    @Test
    public void givenNumShouldReturnSequence3(){

        //Act
        String result= printSequence.print(3); // positive test case 2
        //Assert
        assertEquals("122333",result);

    }

}