package sda2.ShapeAndCircleAndRecAndSq;

/**
 * Created by Daniel on 2017-08-22.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("yellow", true);
        System.out.println(shape);

        Circle circle = new Circle(2, "green", false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(2.0, 4.0, "pink", false);
        System.out.println(rectangle);
    }
}
