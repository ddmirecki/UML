package sda2.ShapeAbstract;

import sda2.ShapeAndCircleAndRecAndSq.*;

/**
 * Created by Daniel on 2017-08-23.
 */
public class Square extends sda2.ShapeAndCircleAndRecAndSq.Rectangle {

    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
}
