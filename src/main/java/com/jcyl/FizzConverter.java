package com.jcyl;

public class FizzConverter implements Converter{
  public boolean meetRule(int value) {
    return value % 3 == 0;
  }
  
  @Override
  public String convert() {
    return "Fizz";
  }
}
