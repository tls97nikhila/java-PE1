package com.stackroute.junitdemo;

public class App {
    public String concatAndConvertString(String str1, String str2) {
        if (str1==null || str2==null){
            return "Null not allowed";
        }
        String concatedString = str1.concat(str2);
        return concatedString.toUpperCase();
    }
}

