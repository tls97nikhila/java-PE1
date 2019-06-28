package com.stackroute.junitdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SortAddNumber {

        public  String sort(int number)
        {
            String var="";

            List<Integer> number_list= new ArrayList<>();
            List<String> strin_list= new ArrayList<>();
            for (int i = number; i > 0; i /= 10)
                number_list.add(i % 10);
            Collections.sort(number_list);  // sorting list in ascending order
            Collections.reverse(number_list); //sorting list in descending order
            for(int i=0;i< number_list.size();i++)
            {
                var+=number_list.get(i);
            }
            return var;
        }

        public boolean addEven(int number)
        {
            int temp=number,remainder,addEven=0;
            while(temp>0)
            {
                remainder=temp%10;
                if(remainder%2==0)
                {
                    addEven+=remainder;
                }
                temp/=10;
            }
            if(addEven>25)
                return true;
            else return false;

        }
    }
