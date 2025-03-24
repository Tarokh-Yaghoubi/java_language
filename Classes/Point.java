package Classes;

import java.util.Objects;

public class Point {

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object)
            return true;

        if (!(object instanceof Point))
            return false;

        var other = (Point) object;
        return other.x == x && other.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class PointTest {

    public static void main(String[] args) {
        var point1 = new Point(23 ,45);
        var point2 = new Point(45 ,40);
        // Here we get false because point1 and point2
        // are two different references.

        System.out.println(point2 == point1);

        // here we also get false because the default
        // implementation of .equals() compares the references
        // this is where we can use method overriding
        System.out.println(point2.equals(point1));
    }
}
