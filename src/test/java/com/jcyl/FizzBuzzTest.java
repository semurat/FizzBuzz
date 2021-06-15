package com.jcyl;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest
{
    FizzBuzzMachine machine;
    
    @Before
    public void init(){
        machine = new FizzBuzzMachine();
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldconvertOneToOne()
    {
        
        String result = machine.translate(1);
        
        assertEquals("1", result);
    }
    
    @Test
    public void shouldconvertTwoToTwo()
    {
        
        String result = machine.translate(2);
        
        assertEquals("2", result);
    }
    
    @Test
    public void shouldconvertThreeToFizz()
    {
        
        String result = machine.translate(3);
        
        assertEquals("Fizz", result);
    }
    
    @Test
    public void shouldconvertFiveTobuzz()
    {
        FizzBuzzMachine machine = new FizzBuzzMachine();
        
        String result = machine.translate(5);
        
        assertEquals("Buzz", result);
    }
}
