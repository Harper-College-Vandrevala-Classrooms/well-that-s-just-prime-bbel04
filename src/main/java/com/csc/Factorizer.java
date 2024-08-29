package com.csc;

public class Factorizer {
  public String PrimeFactor(int number) {

    int originalNumber = number;

    if (number <= 1) {   //if number is less than or equal to 1, it does not have any prime factors
      return number + " has no prime factors";
    }

    String primeFactors = "";   //initialize empty string to store prime factors

    for (int i = 2; i <= Math.sqrt(number); i++) {   //iterate through the given number starting at two up until its square root
      while (number % i == 0) {    
        primeFactors += i + " ";      //if the number is divisible by the current iteration, it is a prime factor -- append to string
        number /= i;                  // divide number by current iteration, repeat until number cannot be equally divided by the iteration
      }      
    }

    if (number > 2) {   //If number is still greater than two, it is a prime number
      primeFactors += number;   
    }

    if (primeFactors.trim().equals(Integer.toString(originalNumber))) {  //if primeFactors is still equal to original number, it must be prime
      return originalNumber + " 1";      //if yes, return the original number and 1 as factors
    }
    else {   
      return primeFactors.trim();  
    }
  }
}