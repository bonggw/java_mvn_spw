package com.gw.java_mvn_spw.calculator;
import org.springframework.stereotype.Service;

import java.util.stream.DoubleStream;

@Service
public class Calculator {
    public int add(int a, int b) {
        System.out.println("call add(..)");
        return a + b;
    }


    static double multiply(double... operands) {
        System.out.println("call multiply(..)");
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }
}
