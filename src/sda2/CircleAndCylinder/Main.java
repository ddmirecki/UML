package sda2.CircleAndCylinder;

/**
 * Created by Daniel on 2017-08-22.
 */
public class Main {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(10, 5);

        double area = cylinder.getArea();

        System.out.println(area);

        double volume = cylinder.getVolume();

        System.out.println(volume);

    }
}
