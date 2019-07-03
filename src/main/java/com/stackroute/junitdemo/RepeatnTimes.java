package com.stackroute.junitdemo;


public class RepeatnTimes {
    public static String  display(String string, int num){
        int str_len=string.length();
        if(string == null || string.isEmpty()){
            return "wrong";  //empty inpput
        }
        String result="";
       int part1= str_len-num;
       for (int i=0;i< str_len;i++){
           result+=(string.charAt(i)); // first part of string
       }
       for(int i=0;i<num;i++){
          result+=(string.substring(part1));  // repeatetion part
       }
        return result;
    }

}

