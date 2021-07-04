package by.epamtc.korshun.task1.par6;

import by.epamtc.korshun.task1.tool.ScanValue;

public class Task6 {
    public  static  long inputQuantityOfSecond(){
        long quantityOfSecond = ScanValue.enterPositiveValueOfSec();
        return quantityOfSecond;
    }
    public static long quantityOfHour (long quantityOfSecond){
        if(quantityOfSecond<0){
            return  -1;
        }
        long quantityOfHour = quantityOfSecond/3600;
        return  quantityOfHour;
    }
    public static int quantityOfMinutes(long quantityOfSecond){
        int quantityOfMinutes = (int)(quantityOfSecond-quantityOfHour(quantityOfSecond)*3600)/60;
        return quantityOfMinutes;
    }
    public static long remainder(long qualityOfSecond){
        long remainder = qualityOfSecond- quantityOfHour(qualityOfSecond)*3600-quantityOfMinutes(qualityOfSecond)*60;
        return remainder;
    }
}
