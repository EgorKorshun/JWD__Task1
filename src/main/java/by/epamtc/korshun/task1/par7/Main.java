package by.epamtc.korshun.task1.par7;

public class Main {
    public static void main(String[] args) throws NullPointException {
        System.out.println("Enter value of first point");
        Point point1 = new Point();
        System.out.println("Enter value of second point");
        Point point2 = new Point();
        System.out.println(Point.checkNearest(point1, point2)+"is closer");
    }
}
