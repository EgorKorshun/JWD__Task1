package by.epamtc.korshun.task1.par3;

import by.epamtc.korshun.task1.tool.ScanValue;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Task3 {
    public  static  double enterAreaOfBigSq(){
        return ScanValue.enterPositiveLong();
    }
    public  static  double radiusOfCircle(double areaOfBigSq){
        double radius=  Math.sqrt((areaOfBigSq)/4);
        return radius;
    }

    public  static  double  areaOfCircle(double radius){
        double areaOfCircle = (2*PI*Math.pow(radius,2));
        return  areaOfCircle;
    }
    public static  double areaOfLittleSq(double radius){
        double areaOfInscribedSq = (2*Math.pow(radius,2));
        return areaOfInscribedSq;
    }
    public  static  double difference(double areaOfBigSq){
        double radiusOfCircle= radiusOfCircle(areaOfBigSq);
        double areaBigSq = (4*pow(radiusOfCircle,2));
        return  areaBigSq/areaOfLittleSq(radiusOfCircle);
    }
}
