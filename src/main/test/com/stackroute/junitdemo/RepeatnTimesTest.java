package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatnTimesTest {

    @Test
    public void givenOneStringOneIntegerShouldReturnRepeatedString(){
        //arrange
        RepeatnTimes repeatnTimes=new RepeatnTimes();
        //Act
        String result= repeatnTimes.display("Stackroute",3);
        //Assert
        assertEquals("Stackrouteuteuteute",result);
    }

    @Test
    public void givenOneStringsOneIntegerShouldReturnRepeatedStrings(){
        //arrange
        RepeatnTimes repeatnTimes=new RepeatnTimes();
        //Act
        String result= repeatnTimes.display("hello",2);
        //Assert
        assertEquals("hellololo",result);
    }

}