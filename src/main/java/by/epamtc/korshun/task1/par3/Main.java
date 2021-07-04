package by.epamtc.korshun.task1.par3;

import static by.epamtc.korshun.task1.par3.Task3.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter  the area of described square");
        double areaOfBigSq = enterAreaOfBigSq();
        System.out.println("area of inscribed square is: "+areaOfLittleSq(radiusOfCircle(areaOfBigSq))
                +"\ndifference between area is: "+difference(areaOfBigSq));
    }
}
