package by.epamtc.korshun.task1.par1;
public class Task1 {

        public  static  int lastSymbol(int number){
            int lastSymbol = number%10;
            return lastSymbol;
        }
        public static int lastDigit(int lastNumber ){
            int result;
            switch (lastNumber) {
                case 1:
                case 9:
                    result = 1;
                    break;
                case 2:
                case 8:
                    result = 4;
                    break;
                case 3:
                case 7:
                    result = 9;
                    break;
                case 4:
                case 6:
                    result = 6;
                    break;
                case 5:
                    result = 5;
                    break;
                case 0:
                    result =0;
                    break;
                default: result = -1;
                    break;
            }
            return result;
        }

    }
