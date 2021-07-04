package by.epamtc.korshun.task1.par7;
import by.epamtc.korshun.task1.tool.ScanValue;
import java.io.Serializable;

class Point implements Serializable {
    private double x;
    private double y;

    Point() {
        x = ScanValue.enterLong();
        y = ScanValue.enterLong();
    }
    Point(double x , double y){
        this.x = x;
        this.y = y;
    }


    public static Point checkNearest(Point point1, Point point2) throws NullPointException {
        if(point1==null ||point2 ==null){
            throw  new NullPointException();
        }
        double firstPointDistanceSq = (Math.pow(point1.getX(),2) + Math.pow(point1.getY(),2));
        double secondPointDistanceSq = (Math.pow(point2.getX(),2) + Math.pow(point2.getY(),2));

        if(firstPointDistanceSq > secondPointDistanceSq)
            return point1 ;
        else if(firstPointDistanceSq < secondPointDistanceSq)
            return  point2;
        else
            return point1;

    }

    public double getX() {
        return x;
    }

    public double setX(double x) {
        this.x = x;
        return 0;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return (int) (17*x*y);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "(" + getX() +
                ", " + getY() +
                ')';
    }
}

