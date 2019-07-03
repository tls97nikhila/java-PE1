package com.stackroute.junitdemo;

import java.util.Scanner;
import java.lang.String;
public class ScannerInteger {

public static int findSum(String input) {

    int sum = 0, score = 0;

    Scanner scanner = new Scanner(System.in);
    scanner = new Scanner(input); // in strings
    while (scanner.hasNextLine()) {
        score = scanner.nextInt(); // save as integer in score and add to sum
        sum += score;
    }

    if(sum>=0)
    return sum;
    else
        return 0;
} //main ends
} // class ends