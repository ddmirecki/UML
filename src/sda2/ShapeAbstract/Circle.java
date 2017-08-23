package sda2.ShapeAbstract;

/**
 * Created by Daniel on 2017-08-23.
 */
public class Circle extends Shape{

    private double _radaius = 1.0;

    public Circle(){
    }
    public Circle(double radius){
        _radaius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        _radaius = radius;
    }

    public double getRadius(){
        return _radaius;
    }

    public void setRadius(double radius){
        _radaius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radaius, 2d);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A circle with radius=")
                .append(_radaius)
                .append(", which is a subclass of ")
                .append(super.toString());
        return sb.toString();
    }
}
