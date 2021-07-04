package by.epamtc.korshun.task1.par5;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par5.Task5.*;

public class Task5Test {


    @Test
    public void createArrayOfDividersTestLengthWithZero() {
        int number = 0;
        int expected = 0;
        int actual = createArrayOfDividers(number).length;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sumOfDividersOfAllPositive() {
        int [] arr = new int[]{1,2,3};
        int expected = 6;
        int actual= sumOfDividers(arr);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void sumOfDividersOfAllNegative() {
        int [] arr = new int[]{-1,-2,-3};
        int expected = -6;
        int actual= sumOfDividers(arr);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void sumOfDividersOfAllZero() {
        int [] arr = new int[]{0,0,0};
        int expected = 0;
        int actual= sumOfDividers(arr);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isPerfectTestCorrect() {
        int number = 6;
        boolean expected = true;
        boolean actual =isPerfect(number);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void isPerfectTestNotCorrect() {
        int number = 5;
        boolean actual = isPerfect(number);
        Assert.assertEquals(actual, false);
    }
}
