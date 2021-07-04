package by.epamtc.korshun.task1.par3;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par3.Task3.*;

public class Task3Test {
    @Test
    public void  radiusOfCircleTestZero(){
        long area = 0;
        long expected = 0;
        long actual = (long) radiusOfCircle(area);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void  radiusOfCircleTestCorrect() {
        double area =12;
        double expected = 1.73;
        double actual =radiusOfCircle(area);
        Assert.assertEquals(actual, expected,0.01);
    }

    @Test
    public void areaOfCircleTestCorrect() {
        double radius =3;
        double expected = 56.55;
        double actual =areaOfCircle(radius);
        Assert.assertEquals(actual, expected,0.01);
    }
    @Test
    public void areaOfCircleTestWithZero() {
        double radius =0;
        double expected = 0;
        double actual =areaOfCircle(radius);
        Assert.assertEquals(actual, expected,0.0);
    }

    @Test
    public void areaOfLittleSqTestCorrect() {
        double radius =5;
        double expected = 50;
        double actual =areaOfLittleSq(radius);
        Assert.assertEquals(actual, expected,0.0);
    }
    @Test
    public void areaOfLittleSqTestWithZero() {
        double radius =0;
        double expected = 0;
        double actual =areaOfLittleSq(radius);
        Assert.assertEquals(actual, expected,0.0);
    }

    @Test
    public void differenceCorrectTest() {
        double area = 142;
        double expected = 2;
        double actual = difference(area);
        Assert.assertEquals(actual, expected,0.0);
    }
}
