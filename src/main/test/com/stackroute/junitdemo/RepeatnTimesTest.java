package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatnTimesTest {
    RepeatnTimes repeatnTimes;
    @Before
    public void setUp(){
        repeatnTimes=new RepeatnTimes();
    }
    @After
    public void teatDown(){
        repeatnTimes=null;
    }
    @Test
    public void givenOneStringOneIntegerShouldReturnRepeatedString(){
        //arrange

        //Act
        String result= repeatnTimes.display("Stackroute",3);
        //Assert
        assertEquals("Stackrouteuteuteute",result);  //positive test case 1
    }

    @Test
    public void givenOneStringsOneIntegerShouldReturnRepeatedStrings(){
        //arrange

        //Act
        String result= repeatnTimes.display("hello",2);    //positive test case 2
        //Assert
        assertEquals("hellololo",result);
    }

    @Test
    public void givenEmptyReturnWrong(){

        //Act
        String result= repeatnTimes.display("",3);
        //Assert
        assertEquals("wrong",result);           //empty string
    }
    @Test (expected = NullPointerException.class)
    public void givenNullReturnWrong(){

        //Act
        String result= repeatnTimes.display(null,3); //null input
        //Assert

    }

}