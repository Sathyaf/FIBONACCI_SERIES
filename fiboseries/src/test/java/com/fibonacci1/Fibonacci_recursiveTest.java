package com.fibonacci1;

import java.util.Arrays;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class Fibonacci_recursiveTest 
{

    private Fibonacci_recursive fibonacci;

    @Before
    public void setup(){
        fibonacci = new Fibonacci_recursive();
    }

    @Test
    public void find_upto0()
    {
        Integer limit = 0;
        assertEquals(Arrays.asList(0),fibonacci.find(limit));
    }

    @Test
    public void find_upto1(){
        Integer limit = 1;
        assertEquals(Arrays.asList(0,1,1),fibonacci.find(limit));
    }

    @Test
    public void find_upto4(){
        Integer limit = 4;
        assertEquals(Arrays.asList(0,1,1,2,3),fibonacci.find(limit));
    }   

    @Test
    public void find_upto25(){
        Integer limit = 25;
        assertEquals(Arrays.asList(0,1,1,2,3,5,8,13,21),fibonacci.find(limit));
    } 

    @Test
    public void find_upto50(){
        Integer limit = 50;
        assertEquals(Arrays.asList(0,1,1,2,3,5,8,13,21,34),fibonacci.find(limit));
    }

    @Test
    public void find_upto100(){
        Integer limit = 100;
        assertEquals(Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89),fibonacci.find(limit));
    }

    @Test
    public void find_upto810(){
        Integer limit = 810;
        assertEquals(Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610),fibonacci.find(limit));
    }

    @Test
    public void find_upto4000(){
        Integer limit = 4000;
        assertEquals(Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584),fibonacci.find(limit));
    }


    @Test
    public void find_upto196418(){
        Integer limit = 196418;
        assertEquals(Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418),fibonacci.find(limit));
    }

    @Test
    public void find_negative(){
        Integer limit = -5;
        assertEquals(Arrays.asList(),fibonacci.find(limit));
    }

    @Test(expected = NullPointerException.class)
    public void testException(){
        Integer limit = null;
        fibonacci.find(limit);
    }

}
