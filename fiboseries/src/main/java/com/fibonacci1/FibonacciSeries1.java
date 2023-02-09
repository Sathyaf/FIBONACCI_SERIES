package com.fibonacci1;

import java.util.ArrayList;

public class FibonacciSeries1
{
    public ArrayList<Integer> find (Integer number){
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Integer nextTerm = 0, first = 0, second = 1;        
        
        while(first <= number){
          
            list.add(first);
            nextTerm = first + second;
            first = second;
            second = nextTerm;
           
        }
       
        return list;
        
    }
}
