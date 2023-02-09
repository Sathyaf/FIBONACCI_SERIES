package com.fibonacci1;

import java.util.ArrayList;

public class Fibonacci_recursive
{
    public Integer recursive(Integer number){

        if(number == 0){
            return 0;
        }

        if(number == 1){
            return 1;
        }

        return recursive(number - 2) + recursive(number - 1);
    }


    public ArrayList<Integer> find(Integer number)
    {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Integer  first = 0;

        while(recursive(first) <= number){
            list.add(recursive(first));
            first++;
        }

        return list;        
        
    }
    
}