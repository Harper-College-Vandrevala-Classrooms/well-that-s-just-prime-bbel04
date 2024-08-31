package com.csc;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  // Replace the following example tests with your own tests
  // of the prime factorization function.
   
  @Test
  public void testPrimeFactorsOfZero() {
    String expected = "0 has no prime factors";
    assertEquals(expected, factorizer.PrimeFactor(0));
  }

  @Test
  public void testPrimeFactorsOfOne() {
    String expected = "1 has no prime factors";
    assertEquals(expected, factorizer.PrimeFactor(1));
  }
  
  @Test
  public void testPrimeFactorsOfThree() {
    String expected = "3";
    assertEquals(expected, factorizer.PrimeFactor(3));
  }

  @Test
  public void testPrimeFactorsOfTen() {
    String expected = "2 5";
    assertEquals(expected, factorizer.PrimeFactor(10));
  }

  @Test
    public void testPrimeFactorsOfTwelve() {
      String expected = "2 2 3";
      assertEquals(expected, factorizer.PrimeFactor(12));
    }

  @Test
    public void testPrimeFactorsOfThriteen() {
      String expected = "13";
      assertEquals(expected, factorizer.PrimeFactor(13));
    }

  @Test
    public void testPrimeFactorsOfTwentyFour() {
      String expected = "2 2 2 3";
      assertEquals(expected, factorizer.PrimeFactor(24));
    }

  @Test
  public void testPrimeFactorsOfFourtyOne() {
    String expected = "41";
    assertEquals(expected, factorizer.PrimeFactor(41));
  }

  @Test
  public void testPrimeFactorsOfOneHundred() {
    String expected = "2 2 5 5";
    assertEquals(expected, factorizer.PrimeFactor(100));
  }
}
