package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalculatorTest extends BaseTest{

    @Test
    public void sinTest(){

        double result = calculator.sin(30);
        Assert.assertEquals(result,Math.sin(30), "Некорректный результат вычисления синуса");

    }
}
