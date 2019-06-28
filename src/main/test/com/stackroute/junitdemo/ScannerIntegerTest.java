package com.stackroute.junitdemo;

import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class ScannerIntegerTest {

    @Test
    public void givenNumbersinStringshouldReturnSum(){



        //arrange
      ScannerInteger scannerInteger=new ScannerInteger();

        //Act
        int result= scannerInteger.findSum("12 2 3 2");
        //Assert
        assertEquals(19,result);
    }

    @Test (expected = InputMismatchException.class)
    public void giveCharinStringShouldReturnError(){

        //arrange
        ScannerInteger scannerInteger=new ScannerInteger();

        //Act
        int result= scannerInteger.findSum("w e");
        //Assert

    }
    @Test (expected = InputMismatchException.class)
    public void givenSplCharinStringShouldReturnError(){

        //arrange
        ScannerInteger scannerInteger=new ScannerInteger();

        //Act
        int result= scannerInteger.findSum("@");
        //Assert

    }


}