package by.epamtc.korshun.task1.par10;

public class Task10 {
    public static double[][] createTable(double min, double max, double step) {
        int size = (int) ((Math.ceil(max - min)) / step);
        double beginOfCalk = min+ step;
        double[][] table = new double[size][2];
        for (int i = 0; beginOfCalk <= max; i++, beginOfCalk += step) {
            table[i][0] = beginOfCalk;
            table[i][1] = Math.tan(beginOfCalk);
        }
        return  table;
    }
    public  static double[][]  printTable(double[][] table) {

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t ");

            }
            System.out.println();
        }
        return table;
    }
}
