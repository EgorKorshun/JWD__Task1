package by.epamtc.korshun.task1.par9;

import static java.lang.Math.PI;

public class Task9 {
    public  static  double circumference(double radius) throws NegativeArgumentException {
        if(radius<0){
           throw new NegativeArgumentException();
        }
        double circumference = 2* PI* radius;
        return circumference;
    }
    public static  double areaOfCircle(double radius) throws NegativeArgumentException {
        if(radius<0){
            throw new NegativeArgumentException();
        }
        double areaOfCircle = 2*PI*Math.pow(radius,2);
        return  areaOfCircle;
    }

    public static void main(String[] args) throws NegativeArgumentException {
        System.out.println(areaOfCircle(10));
    }
}
