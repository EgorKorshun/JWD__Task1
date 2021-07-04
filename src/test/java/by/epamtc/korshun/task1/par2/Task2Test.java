package by.epamtc.korshun.task1.par2;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par2.Task2.quantityOfDays;

public class Task2Test {
    @Test
    public void whatTheYear() {
    }

    @Test
    public void whatTheMonth() {
    }

    @Test
    public void quantityOfDaysTestCorrect() {
        int month = 12;
        int expected = 31;
        int actual = quantityOfDays(month);
        Assert.assertEquals(actual, expected);
    }
}
