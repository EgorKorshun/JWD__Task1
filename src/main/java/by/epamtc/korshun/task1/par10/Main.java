package by.epamtc.korshun.task1.par10;

import by.epamtc.korshun.task1.tool.ScanValue;

import static by.epamtc.korshun.task1.par10.Task10.createTable;
import static by.epamtc.korshun.task1.par10.Task10.printTable;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter  min value");
        double minValue = ScanValue.enterLong();
        System.out.println("enter max value");
        double maxValue = ScanValue.enterLong();
        if(maxValue<minValue) {
            System.out.println("not correct. Max value must be bigger");
            maxValue = ScanValue.enterLong();
        }
        System.out.println("enter value of step");
        double step = ScanValue.enterLong();

        System.out.println("\tresult:\n\nx\t\t F(x)\n" +
                "____________________________");
        printTable(createTable(minValue,maxValue,step));
    }
}
