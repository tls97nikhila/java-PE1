package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class ScannerIntegerTest {
        ScannerInteger scannerInteger;
    @Before
    public void setUp(){
        scannerInteger=new ScannerInteger();
    }
    @After
    public void tearDown(){
        scannerInteger=null;
    }
    @Test
    public void testgivenNumbersinStringshouldReturnSum(){


        //Act
        int result= scannerInteger.findSum("12 2 3 2"); //correct result
        //Assert
        assertEquals(19,result);
    }

    @Test (expected = InputMismatchException.class)
    public void testgiveCharinStringShouldReturnError(){

        //Act
        int result= scannerInteger.findSum("w e"); //input mis match


    }
    @Test (expected = InputMismatchException.class)
    public void testgivenSplCharinStringShouldReturnError(){

        int result= scannerInteger.findSum("@"); //wrong input


    }


}