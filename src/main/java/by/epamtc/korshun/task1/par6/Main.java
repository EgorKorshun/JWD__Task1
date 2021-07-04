package by.epamtc.korshun.task1.par6;

import static by.epamtc.korshun.task1.par6.Task6.*;

public class Main {
    public static void main(String[] args) {
        long quantityOfSecond = inputQuantityOfSecond();
        System.out.println("hours: " + quantityOfHour(quantityOfSecond));
        System.out.println("minutes: " + quantityOfMinutes(quantityOfSecond));
        System.out.println("seconds: " + remainder(quantityOfSecond));
    }
}
