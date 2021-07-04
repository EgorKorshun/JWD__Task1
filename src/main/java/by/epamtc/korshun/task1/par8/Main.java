package by.epamtc.korshun.task1.par8;

import by.epamtc.korshun.task1.tool.ScanValue;
import static by.epamtc.korshun.task1.par8.Task8.firstCondition;
import static by.epamtc.korshun.task1.par8.Task8.secondCondition;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter value of ");
        String function = "F(x) = ";
        int x = ScanValue.enterInt();
        if(x>=3)
            System.out.println(function+ firstCondition(x));
        else
            System.out.println(function + secondCondition(x));
    }
}
