package com.stackroute.junitdemo;


public class TomnJerry {
    public static String findMe(int num) {
        if ((num > 20 && num <= 30)) {
            if (num % 2 == 0) {
                return "Tom"; //condition check

            } else {
                return "Jerry";
            }

        } else {
          return "Out of bounds"; // out of 20 to 30

        }

    }
}