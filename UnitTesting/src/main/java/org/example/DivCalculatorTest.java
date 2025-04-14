package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalculatorTest extends BaseTest{

    @Test
    public void divTest(){

        double result = calculator.div(39,13);
        Assert.assertEquals(result,3, "Некорректный результат деления");

    }
}
