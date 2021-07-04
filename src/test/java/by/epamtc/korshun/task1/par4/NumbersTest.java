package by.epamtc.korshun.task1.par4;
import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task1.par4.Numbers.verification;

public class NumbersTest {

    @Test
    public void conditionalCheckerWithOne() {
        Numbers numbers = new Numbers(1,2,1,1);
        int expected = 1;
        int actual =numbers.conditionalChecker();
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void conditionalCheckerWithout() {
        Numbers numbers = new Numbers(-1,1,1,1);
        int expected = 0;
        int actual =numbers.conditionalChecker();
        Assert.assertEquals(actual, expected);
    }
    @Test
    public  void  verificationTestWithNegative(){
        int checker = -12;
        boolean expected = false;
        boolean actual = verification(checker);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public  void  verificationTestWithZero(){
        int checker =0;
        boolean expected = false;
        boolean actual = verification(checker);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public  void  verificationTestWithCorrectCondition(){
        int checker = 3;
        boolean expected = true;
        boolean actual = verification(checker);
        Assert.assertEquals(actual, expected);
    }
}
