package by.epamtc.korshun.task1.par9;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par8.Task8.firstCondition;
import static by.epamtc.korshun.task1.par9.Task9.areaOfCircle;
import static by.epamtc.korshun.task1.par9.Task9.circumference;
import static org.junit.Assert.*;

public class Task9Test {

    @Test
    public void circumferenceTestWithZero() throws NegativeArgumentException {
        double value = 0;
        double expected =0 ;
        double actual = circumference(value);
        Assert.assertEquals(actual, expected,0.0);
    }
    @Test(expected = NegativeArgumentException.class)
    public void circumferenceTestWithNegativeValue() throws NegativeArgumentException {
        double value = -10;
        circumference(value);
    }
    @Test
    public void areaOfCircleWithZero() throws NegativeArgumentException {
        double value = 0;
        double expected =0 ;
        double actual = areaOfCircle(value);
        Assert.assertEquals(actual, expected,0.0);
    }
    @Test(expected = NegativeArgumentException.class)
    public void areaOfCircleWithNegative() throws NegativeArgumentException {
        double value = -100;
        areaOfCircle(value);
    }
    @Test
    public void circumferenceTestCorrectResult() throws NegativeArgumentException {
        double value = 10;
        double expected =62.83 ;
        double actual = circumference(value);
        Assert.assertEquals(actual, expected,0.01);
    }
    @Test
    public void areaOfCircleTestCorrectResult() throws NegativeArgumentException {
        double value = 10;
        double expected =628.3 ;
        double actual = areaOfCircle(value);
        Assert.assertEquals(actual, expected,0.1);
    }
}