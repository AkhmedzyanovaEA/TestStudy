package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultCalculatorTest extends BaseTest{

    @Test
    public void multTest(){

        double result = calculator.mult(11,12);
        Assert.assertEquals(result,132, "Некорректный результат умножения");

    }

}
