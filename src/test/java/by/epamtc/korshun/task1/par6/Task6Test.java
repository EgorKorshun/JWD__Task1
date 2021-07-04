package by.epamtc.korshun.task1.par6;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par6.Task6.quantityOfHour;
import static by.epamtc.korshun.task1.par6.Task6.quantityOfMinutes;
import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void inputQuantityOfSecond() //
    {
    }
    @Test
    public void quantityOfHourTestCorrect() {
        int value =3600;
        int expected = 1;
        long actual = quantityOfHour(value);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void quantityOfHourTestWithZeroParam() {
        int value =0;
        int expected = 0;
        long actual = quantityOfHour(value);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void quantityOfHourTestWithNegativeParam() {
        int value =-1;
        int expected = -1;
        long actual = quantityOfHour(value);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainderTestWithZero() {
        int value =0;
        int expected = 0;
        long actual = Task6.remainder(value);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void remainderCorrectTest() {
        int value =3662;
        int expected = 2;
        long actual = Task6.remainder(value);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void quantityOfMinutesCorrectOneTest() {
        int value =60;
        int expected = 1;
        long actual = quantityOfMinutes(value);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void quantityOfMinutesLessOneTest() {
        int value =30;
        int expected = 0;
        long actual = quantityOfMinutes(value);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void quantityOfMinutesCorrect59Test() {
        int value =3540;
        int expected = 59;
        long actual = quantityOfMinutes(value);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void quantityOfMinutesCorrect60Test() {
        int value =3600;
        int expected = 0;
        long actual = quantityOfMinutes(value);
        Assert.assertEquals(actual, expected);
    }
}