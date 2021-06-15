package com.jcyl;

public class FizzConverter implements Converter{
  public final int VALUE_MATCH= 3;
  public boolean meetRule(int value) {
    return value % VALUE_MATCH == 0;
  }
  
  @Override
  public String convert() {
    return "Fizz";
  }
}
