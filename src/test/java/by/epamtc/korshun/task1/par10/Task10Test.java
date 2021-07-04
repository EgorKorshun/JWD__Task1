package by.epamtc.korshun.task1.par10;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par10.Task10.createTable;


public class Task10Test {

    @Test
    public void createTableTestLength() {
        double min = 5;
        double max = 15;
        double step = 2;
        double[][] testArray = createTable(min,max,step);
        int expectedLength = 5;
        int actualLength = testArray.length;
        Assert.assertEquals(actualLength,expectedLength);
    }
    @Test
    public void createTableTestCorrectOfCalc() {
        double min = 5;
        double max = 15;
        double step = 2;
        double[][] testArray = createTable(min,max,step);
        double expected = 0.87;
        double actual = testArray[0][1];
        Assert.assertEquals(actual,expected,0.01);
    }

}