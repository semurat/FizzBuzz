package com.jcyl;

public class BuzzConverter implements Converter{
  public boolean meetRule(int value) {
    return value % 5 == 0;
  }
  
  @Override
  public String convert() {
    return "Buzz";
  }
}
