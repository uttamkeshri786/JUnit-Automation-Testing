package com.automation.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.automation.test.junit.model.MyClass;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThrows;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class MyClassTest {

  @Test
  public void test() {
      fail("Not yet implemented");
  }

  @Test
  void testExceptionIsThrown() {
      MyClass tester = new MyClass();
      assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5));
  }

  @Test
  void testMultiply() {
      MyClass tester = new MyClass();
      assertEquals(50, tester.multiply(10, 5), "10 x 5 must be 50");
  }

  private void assertEquals(int i, int multiply, String string) {
      // TODO Auto-generated method stub
      
  }
}
