package by.epamtc.korshun.task1.par2;

import static by.epamtc.korshun.task1.tool.Checker.checkPositiveInt;

public class LogicOfYear {
    public  static  int checkMonth(){
        int month = checkPositiveInt();
        if(month>12){
            System.out.println("Enter 1 -12 ");
            month=checkMonth();
        }
        return  month;
    }

    public  static  boolean validatorOfLeapYear(int year){
        boolean defaultYear;
        if((year%4==0) && (year%100!=0) ||
                ((year % 100 != 0) && (year%400 == 0))) {
            defaultYear = false;
        }
        else {
            defaultYear = true;
        }
        return defaultYear;
    }
}
