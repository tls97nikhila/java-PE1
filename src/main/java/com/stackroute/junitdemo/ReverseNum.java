package com.stackroute.junitdemo;

import java.util.Scanner;

public class ReverseNum {

    public static String reversel(String input){
        if(input == null || input.isEmpty()){
            return input;  //empty inpput
        }
        String reverse = "";
        for(int i = input.length() -1; i>=0; i--){
            reverse = reverse + input.charAt(i);
        }

        return reverse;
    }

    }
