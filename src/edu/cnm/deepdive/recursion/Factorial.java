package edu.cnm.deepdive.recursion;

import java.math.BigInteger;

public class Factorial {
  
  public static BigInteger factorial(int n) {
//    iterative way of doing this
//    int product = 1;
//    for (int i = 1; i <= n; i++) {
//      product *= i;
//    }
//    return product;
//    regular way of dealing with factorial
//    return (n <= 1) ? 1 : n * factorial(n-1);
    
//    using BigInteger for larger numbers 
    return (n <= 1) 
        ? BigInteger.ONE 
        : factorial(n - 1).multiply(BigInteger.valueOf(n));
  }
}
