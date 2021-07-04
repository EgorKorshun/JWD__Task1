package by.epamtc.korshun.task1.par7;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par7.Point.checkNearest;
import static org.junit.Assert.*;

public class PointTest {

    @Test(expected = NullPointException.class)
    public void checkNearestNullTest() throws NullPointException {
        Point point1 = new Point(12,321);
        Point point2 = null;
        checkNearest(point1,point2);
    }

    @Test
    public void checkNearestCorrectEquals(){
        Point point1 = new Point(12,321);
        Point point2 = new Point(12,321);
        if(point1.equals(point2)){
            return;
        }
        else {
            throw  new AssertionError();
        }
    }

    @Test
    public void changeParameterTest(){
        int x =12;
        double z =123;
        Point point = new Point(x,z);
        point.setX(123);
        int actual = (int ) point.getX();
        int expected = 123;
        Assert.assertEquals(actual, expected);

    }
}