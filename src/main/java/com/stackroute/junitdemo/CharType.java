package com.stackroute.junitdemo;


public class CharType {
    public static String  type(char ch){
        if(ch >= 48 && ch<= 57){
            return "Number";
        }
        else if(ch >= 65 && ch<= 90){
         return"Capital Letter";
        }
        else if(ch >= 97 && ch<= 122){
          return"Small Letter";
        }
        else{
           return "Special Char";
        }
    } // end of function type

    } //end class
