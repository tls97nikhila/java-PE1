package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setUp(){
    System.out.println("Before");
    app=new App();

    }
    @After
    public void tearDown(){
        System.out.println("After");
        app=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("AfterClass");

    }
    @Test
    public void givenTwoStringsShouldReturnConcatinatedUpperString(){


        //arrange
        App app= new App();
        //Act
        String result= app.concatAndConvertString("Demooo","done");
        //Assert
        assertEquals("DEMOOODONE",result);
    }
    @Test
    public void givenTwoNullShouldReturnErrorMessage(){
        //arrange
        App app= new App();
        //Act
        String result= app.concatAndConvertString(null,null);
        //Assert
        assertEquals("Null not allowed",result);
    }

    @Test
    public void givenOneEmptyStringOneNumericStringShouldReturnNumeric(){
        //arrange
        App app= new App();
        //Act
        String result= app.concatAndConvertString("","56");
        //Assert
        assertEquals("56",result);
    }



}