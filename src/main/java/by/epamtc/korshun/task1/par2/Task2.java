package by.epamtc.korshun.task1.par2;

import by.epamtc.korshun.task1.tool.Checker;

import static by.epamtc.korshun.task1.par2.LogicOfYear.validatorOfLeapYear;

public class Task2 {
    public  static  boolean whatTheYear(){
        boolean whatTheYear = validatorOfLeapYear(Checker.checkPositiveInt());
        return  whatTheYear;
    }
    public  static  int whatTheMonth(){
        int month = LogicOfYear.checkMonth();
        return  month;
    }
    public static int quantityOfDays(int month) {
        boolean whatTheYear = whatTheYear();
        int days = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            case 2:
                if(whatTheYear==true){
                    days=28;
                }
                else
                    days=29;

                break;
        }
        return days;
    }
}
