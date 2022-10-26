import java.awt.*;

public class Task16Point {
    int x;
    int y;

    public void Point() {
        System.out.println("no arg constructor");
    }

    public void Point(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public int getX() {
        return x;

    }

    public int getY() {
        return y;

    }

    public void setX(int x1) {
        this.x = x1;

    }

    public void setY(int y1) {
        this.y = y1;

    }

    public double distance() {
        //dis=Math.sqrt((x2-x1)(x2-x1) + (y2-y1)(y2-y1))
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point secondPoint) {

        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println(("distance(2,2)= " + first.distance(2, 2)));
        Point point = new Point();
        System.out.println(("distance()= " + point.distance()));
    }

}
