package by.epamtc.korshun.task1.par5;

import by.epamtc.korshun.task1.tool.Checker;

public class Task5 {
    public  static  int inputNumber(){
        int number= Checker.checkPositiveInt();
        return  number;
    }
    public  static  int[] createArrayOfDividers(int number){
        if(number<0){
            return null;
        }
        int [] arrayOfDividers=new int[number];
        for (int i = 1; i < number; i++) {
            if(number%i==0){
                arrayOfDividers[i]=i;}
        }
        return arrayOfDividers;
    }

    public static int sumOfDividers(int [] arrayOfDividers){
        int sum=0;
        for (int num:arrayOfDividers) {
            sum += num;
        }
        return sum;
    }
    public  static  boolean isPerfect(int number){
        if(sumOfDividers(createArrayOfDividers(number))==number)
            return true;
        return  false;
    }
}
