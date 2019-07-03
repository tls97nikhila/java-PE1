package com.stackroute.junitdemo;



public class PrintSequence {


    public static String print(int iterate) {
        String result="",n;
        if(iterate>=1) {
            for (int i = 1; i <= iterate; i++) { //loop 1
                for (int j = 1; j <= i; j++) //loop 2
                    result += i;
            } // end  inner for
            return result;
        }
        else
          n=  "Wrong Format";
        return n;

    }//end outer for

}