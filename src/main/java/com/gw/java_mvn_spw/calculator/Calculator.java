package com.gw.java_mvn_spw.calculator;

import java.util.stream.DoubleStream;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

  public int add(int a, int b) {
    System.out.println("call add(..)");
    if (a < 0 || b < 0) {
      a += 10;
    }
    int t = 10;
    return a + b;
  }

  static double multiply(double... operands) {
    System.out.println("call multiply(..)");
    return DoubleStream.of(operands)
      .reduce(1, (a, b) -> a * b);
  }
}
