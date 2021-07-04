package by.epamtc.korshun.task1.tool;

public class Checker {

    public  static  int checkPositiveInt(){
        int number = ScanValue.enterInt();
        if(number<0){
            number = checkPositiveInt();
        }
        return number;
    }

}
