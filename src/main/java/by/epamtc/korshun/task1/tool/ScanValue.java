package by.epamtc.korshun.task1.tool;

import java.util.Scanner;

public class ScanValue {
    static Scanner scan = new Scanner(System.in);
    public static int enterInt() {
        int number;
        while (!scan.hasNextInt()) {
            scan.next();
        }
        number= scan.nextInt();
        return number;
    }
    public static int enterPositiveInt(){
        int number;
        while (!scan.hasNextInt()){
            scan.next();
        }
        number = scan.nextInt();
        return number;
    }

    public  static  long enterPositiveLong(){
        long value = enterLong();
        if(value<0){
            value = enterLong();
        }
        return  value;
    }

    public  static  long enterLong(){
        long value;
        while (!scan.hasNextLong()){
            scan.next();
        }
        value=scan.nextLong();
        return value;
    }

    public  static  long enterPositiveValueOfSec(){
        long seconds = scan.nextLong();
        if(seconds<0){
            seconds= enterPositiveValueOfSec();
        }
        return seconds;
    }
}

