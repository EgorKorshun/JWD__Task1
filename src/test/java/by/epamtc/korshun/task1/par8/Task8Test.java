package by.epamtc.korshun.task1.par8;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par1.Task1.lastDigit;
import static by.epamtc.korshun.task1.par8.Task8.firstCondition;
import static by.epamtc.korshun.task1.par8.Task8.secondCondition;

public class Task8Test {

    @Test
    public void firstConditionTestWithZero() {
        int value = 0;
        int expected = 9;
        int actual = firstCondition(value);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void firstConditionTestWithNegative() {
        int value = -1;
        int expected = 5;
        int actual = firstCondition(value);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void firstConditionTestCorrect() {
        int value = 10;
        int expected = -61 ;
        int actual = firstCondition(value);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void secondConditionTestWithZero() {
        int value = 0;
        double expected = -0.1666 ;
        double actual = secondCondition(value);
        Assert.assertEquals(actual, expected,0.1);
    }

    @Test
    public void secondConditionTestWithValueMoreThanGiven() {
        int value = 4;
        double expected = 0.01724 ;
        double actual = secondCondition(value);
        Assert.assertEquals(actual, expected,0.1);
    }
    @Test
    public void secondConditionTestWithMinus100() {
        int value = -100;
        double expected = -9.999940000359997E-7 ;
        double actual = secondCondition(value);
        Assert.assertEquals(actual, expected, 0.1);
    }
}