package com.stackroute.junitdemo;

import java.lang.String;


public class Palindrome {

        public static String isPalindrome(long num) {
            long lastDigit, sum = 0, a;
            boolean b;
            a = num;
            while (a > 0) {
                lastDigit = a % 10;
                sum = (sum * 10) + lastDigit;  // reverse
                a = a / 10;
            }
            if (num == sum) {  // check pal
                b = true;

            } else
                b = false;


            long y = num;
            long  last, total = 0;

            if (b) {
                while (num > 0) {
                    last = num % 10;
                    if (last % 2 == 0) {
                        total += last;
                    }
                    num = num / 10;
                }
                if (total >= 25) {
                    return(y + " is palindrome and sum of even numbers is greater than 25");
                } else {
                    return(y + " is palindrome and sum of even numbers is less than 25");
                }


            } //end of isPalindrome if part
            else {
                return(y + " is not a palindrome");
            }
        } // end main
}   //palindrome class

