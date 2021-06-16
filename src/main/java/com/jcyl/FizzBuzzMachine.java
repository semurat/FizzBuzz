package com.jcyl;

import java.util.*;

public class FizzBuzzMachine {
  
  List <Converter> converters;
  
  public FizzBuzzMachine(){
    converters = Arrays.asList(new FizzConverter(), new BuzzConverter(), new FizzBuzzConverter());
    
  }
  public String translate(int value) {
    
    if(value==0){
      throw new IllegalArgumentException("Zero values not allowed");
    }
    
    String result= String.valueOf(value);
    for(Converter converter :converters){
      if(converter.meetRule(value)){
        result = converter.convert();
      }
      
    }
   
    return result;
  }
  
  
  private boolean meetBuzz(int value) {
    return value % 5 == 0;
  }
  
}
