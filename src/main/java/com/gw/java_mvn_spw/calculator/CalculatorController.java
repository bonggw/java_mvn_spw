package com.gw.java_mvn_spw.calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private Calculator calculator;

    @RequestMapping("/add")
    String add(@RequestParam("a") Integer a,
               @RequestParam("b") Integer b) {
        return String.valueOf(calculator.add(a, b));
    }

    @RequestMapping("/multiply")
    String multiply(@RequestParam("a") Integer a,
               @RequestParam("b") Integer b) {
        System.out.println("call multiply(..)");
        return String.valueOf(calculator.multiply(a, b));
    }

}
