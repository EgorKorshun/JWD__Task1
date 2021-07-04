package by.epamtc.korshun.task1.par2;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par2.LogicOfYear.validatorOfLeapYear;


public class LogicOfYearTest {

    @Test
    public void validatorOfLeapYearCorrect() {
        int value =2012;
        boolean expected = false;
        boolean actual = validatorOfLeapYear(value);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void validatorOfLeapYearWithZero() {
        int value =0;
        boolean expected = true;
        boolean actual = validatorOfLeapYear(value);
        Assert.assertEquals(actual, expected);
    }
}
