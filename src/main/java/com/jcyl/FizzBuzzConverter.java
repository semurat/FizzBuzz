package com.jcyl;

public class FizzBuzzConverter implements Converter{
  public boolean meetRule(int value) {
    
    return value % 3 == 0 && value % 5 == 0;
  }
  
  @Override
  public String convert() {
    return "FizzBuzz";
  }
}
