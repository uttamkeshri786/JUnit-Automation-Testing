package com.automation.test.junit;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import com.automation.test.junit.model.Calculator;

@SuppressWarnings("unused")
public class CalculatorTest {

  Calculator calculator;

  @Before                                         
  void setUp() {
      calculator = new Calculator();
  }
  
//
//  Open Declaration:-  void com.automation.test.junit.CalculatorTest.testMultiplyWithZero()
//    @RepeatedTest
//    @DisplayName


  @Test                                               
  @DisplayName("Simple multiplication should work")   
  void testMultiply() {
      assertEquals(20, calculator.multiply(4, 5),     
              "Regular multiplication should work");  
  }

  @RepeatedTest(5)                                    
  @DisplayName("Ensure correct handling of zero")
  void testMultiplyWithZero() {
      assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
      assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
  }

  private void assertEquals(int i, int multiply, String string) {
    // TODO Auto-generated method stub 
    }
}
