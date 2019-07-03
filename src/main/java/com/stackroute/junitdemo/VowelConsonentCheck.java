package com.stackroute.junitdemo;

import java.util.Scanner;
import java.lang.String;

public class VowelConsonentCheck {
    public static String check(String str) {
        String result="";
        for (int i = 0, n = str.length(); i < n; i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') // if vowels
                    result+="vowel ";
                else
                    result+="consonant ";  // else consonents
            } // error check


            else {
                result+="wrong format ";
            }
        } //iteration
        return result;
    } // main
}// class