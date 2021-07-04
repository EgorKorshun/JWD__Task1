package by.epamtc.korshun.task1.par9;

import by.epamtc.korshun.task1.tool.ScanValue;
import static by.epamtc.korshun.task1.par9.Task9.areaOfCircle;
import static by.epamtc.korshun.task1.par9.Task9.circumference;

public class Main {
    public static void main(String[] args) throws NegativeArgumentException {
        System.out.println("Enter radius");
        double radius = ScanValue.enterPositiveLong();
        System.out.println("circumference is "+circumference(radius));
        System.out.println("area of circle is "+areaOfCircle(radius));
    }
}
