package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAddNumberTest {
  SortAddNumber sortAddNumber;
    @Before
    public void setUp(){
      sortAddNumber=new SortAddNumber();


    }
    @After
    public void tearDown(){

       sortAddNumber=null;
    }
    @Test
    public void givenNumbersShouldReturnSortedOrder() {

        String result = sortAddNumber.sort(7112);
        //Assert
        assertEquals("7211", result);
    }
    @Test
    public void givenNumbersShouldReturnFalseIfLessThan25() {

        boolean result2= sortAddNumber.addEven(7142309);
        assertFalse(result2);
                                        //assert False
    }
    @Test
    public void givenNumbersShouldReturnTrueIfMoreThan25() {

        boolean result2= sortAddNumber.addEven(7848389);
        assertTrue(result2);                                // assert true

    }

    @Test
    public void givenNumbersReturnSorted2() {


        String result = sortAddNumber.sort(9909);
        //Assert
        assertEquals("9990", result);
    }


}