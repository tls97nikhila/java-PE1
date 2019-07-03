package com.stackroute.junitdemo;

import java.util.Random;
import java.util.*;
public class GuessNum {

    public static String guess(Integer instance_num,Integer guess_num) {

            if (guess_num == instance_num) {
                return "Number guessed matches the original";
            } else if (guess_num > instance_num) {
                return "Number guessed is greater than the original";

            } else if (guess_num < instance_num) {
                return ("Number guessed less than the original");

            }

        return null;
    } // function guess





} // end calss
