package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosCalculatorTest extends BaseTest{
    @Test
    public void cosTest(){

        double result = calculator.cos(30);
        Assert.assertEquals(result,Math.cos(30), "Некорректный результат вычисления косинуса");

    }
}
