package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
  Palindrome palindrome;
    @Before
    public void setUp()  { palindrome=new Palindrome();
    }

    @After
    public void tearDown()  {palindrome=null;
    }

        @Test
        public void givenNumberPalindromeShouldReturnPalindrome(){


            //Act
            String result= palindrome.isPalindrome(1221);  //even number of digits
            //Assert
            assertEquals("1221 is palindrome and sum of even numbers is less than 25",result);
        }

    @Test
    public void givenNonPalindromeNumberShouldReturnNotPalindrome(){

        //Act
        String result= palindrome.isPalindrome(1233);
        //Assert
        assertEquals("1233 is not a palindrome",result);
    }

    @Test
    public void givenPalindromeNumberShouldReturnisPalindrome1(){


        //Act
        String result= palindrome.isPalindrome(86868); //odd num of digits
        //Assert
        assertEquals("86868 is palindrome and sum of even numbers is greater than 25",result);
    }

    }
