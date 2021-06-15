package com.jcyl;

import java.util.*;

public class FizzBuzzMachine {
  
  List <Converter> converters = new ArrayList <>();
  
  public FizzBuzzMachine(){
    Converter fizzconverter = new FizzConverter();
    Converter buzzconverter = new BuzzConverter();
    converters.add(fizzconverter);
    converters.add(buzzconverter);
    
  }
  public String translate(int value) {
    
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
