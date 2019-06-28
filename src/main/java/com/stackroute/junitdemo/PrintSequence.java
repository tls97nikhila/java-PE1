package com.stackroute.junitdemo;



public class PrintSequence {


    public static String print(int iterate) {
        String result="",n;
        if(iterate>=1) {
            for (int i = 1; i <= iterate; i++) {
                for (int j = 1; j <= i; j++)
                    result += i;
            } // end  outer for
            return result;
        }
        else
          n=  "Wrong Format";
        return n;

    }//end print

}