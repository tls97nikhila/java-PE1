package com.stackroute.junitdemo;

import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class ReverseNumTest {

    @Test
    public void givenOneStringShouldReturnReverseString(){
        //arrange
       ReverseNum reverseNum=new ReverseNum();
        //Act
        String result= reverseNum.reversel("Stackroute");
        //Assert
        assertEquals("etuorkcatS",result);
    }

    @Test
    public void givenOneStringOneShouldReturnReversedString(){
        //arrange
        ReverseNum reverseNum=new ReverseNum();
        //Act
        String result= reverseNum.reversel("Talla123");
        //Assert
        assertEquals("321allaT",result);
    }

    @Test
    public void givenOneStringOneShouldReturnReversed(){
        //arrange
        ReverseNum reverseNum=new ReverseNum();
        //Act
        String result= reverseNum.reversel("@");
        //Assert
        assertEquals("@",result);
    }


}