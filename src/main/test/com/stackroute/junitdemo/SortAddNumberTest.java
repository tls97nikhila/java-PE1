package com.stackroute.junitdemo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAddNumberTest {
  SortAddNumber sortAddNumber;
    @Before
    public void setUp(){
        System.out.println("Before");


    }
    @Test
    public void givenNumbersShouldReturnSortedOrder() {
        SortAddNumber sortAddNumber=new SortAddNumber();

        String result = sortAddNumber.sort(7112);
        //Assert
        assertEquals("7211", result);
    }
    @Test
    public void givenNumbersShouldReturnFalseIfLessThan15() {
        SortAddNumber sortAddNumber=new SortAddNumber();
        boolean result2= sortAddNumber.addEven(7142309);
        assertEquals(false,result2);

    }
    @Test
    public void givenNumbersShouldReturnSortedOrder2() {
        SortAddNumber sortAddNumber=new SortAddNumber();

        String result = sortAddNumber.sort(9909);
        //Assert
        assertEquals("9990", result);
    }


}