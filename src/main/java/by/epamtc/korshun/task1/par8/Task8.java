package by.epamtc.korshun.task1.par8;

public class Task8 {
    public static int firstCondition(int x){
        int resultOfFirstCondition = (int) -(Math.pow(x,2))+3*x+9;
        return  resultOfFirstCondition;
    }
    public  static double secondCondition(int x){
        double resultOfSecondCondition =   Math.pow((Math.pow(x,3)-6),-1);
        return resultOfSecondCondition;
    }
}
