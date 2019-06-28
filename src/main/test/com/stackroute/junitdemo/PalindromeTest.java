package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

        @Test
        public void givenNumberPalindromeShouldReturnPalindrome(){

            //arrange
        Palindrome palindrome=new Palindrome();

            //Act
            String result= palindrome.isPalindrome(121);
            //Assert
            assertEquals("121 is palindrome and sum of even numbers is less than 25",result);
        }

    @Test
    public void givenNonPalindromeNumberShouldReturnNotPalindrome(){



        //arrange
        Palindrome palindrome=new Palindrome();

        //Act
        String result= palindrome.isPalindrome(1233);
        //Assert
        assertEquals("1233 is not a palindrome",result);
    }

    @Test
    public void givenPalindromeNumberShouldReturnisPalindrome1(){



        //arrange
        Palindrome palindrome=new Palindrome();

        //Act
        String result= palindrome.isPalindrome(86868);
        //Assert
        assertEquals("86868 is palindrome and sum of even numbers is greater than 25",result);
    }
    }
