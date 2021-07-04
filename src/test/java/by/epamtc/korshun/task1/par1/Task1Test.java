package by.epamtc.korshun.task1.par1;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par1.Task1.lastDigit;
public class Task1Test {
    @Test
    public void lastDigitTestWithZero() {
        int number = 0;
        int expected = 0;
        int actual = lastDigit(number);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void lastDigitTestDouble() {
        int number = 12;
        int expected = -1;
        int actual = lastDigit(number);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void lastSymbolTestValueIsZero() {
        int value = 0;
        int expected = 0;
        int actual = Task1.lastSymbol(value);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void lastSymbolTest() {
        int value = 12;
        int expected = 2;
        int actual = Task1.lastSymbol(value);
        Assert.assertEquals(actual, expected);
    }
}

