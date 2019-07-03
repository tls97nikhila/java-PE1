package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class ReverseNumTest {
 ReverseNum reverseNum;
 @Before
 public void setUp(){
     reverseNum = new ReverseNum();
 }
 @After
 public void tearDown(){
     reverseNum=null;

 }
    @Test
    public void givenOneStringShouldReturnReverseString(){

        //Act
        String result= reverseNum.reversel("Stackroute");
        //Assert
        assertEquals("etuorkcatS",result);
    }

    @Test
    public void givenOneStringOneShouldReturnReversedString(){

        //Act
        String result= reverseNum.reversel("Talla123");
        //Assert
        assertEquals("321allaT",result);
    }

    @Test
    public void givenOneStringOnereturnsame(){

        //Act
        String result= reverseNum.reversel("@");
        //Assert
        assertEquals("@",result);
    }
    @Test
    public void givenOneStringOneShouldReturnReversed(){

        //Act
        String result= reverseNum.reversel("");
        //Assert
        assertEquals("wrong",result);
    }


}