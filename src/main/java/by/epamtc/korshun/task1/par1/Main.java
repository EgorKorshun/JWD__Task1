package by.epamtc.korshun.task1.par1;

import by.epamtc.korshun.task1.tool.ScanValue;

import static by.epamtc.korshun.task1.par1.Task1.lastDigit;
import static by.epamtc.korshun.task1.par1.Task1.lastSymbol;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter number");
        System.out.println("last squared is " + lastDigit(lastSymbol(ScanValue.enterInt())));
    }
}
