package by.epamtc.korshun.task1.par2;

import static by.epamtc.korshun.task1.par2.Task2.quantityOfDays;
import static by.epamtc.korshun.task1.par2.Task2.whatTheMonth;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter the month and the year");
        System.out.print("Days: " + quantityOfDays(whatTheMonth()));
    }
}
