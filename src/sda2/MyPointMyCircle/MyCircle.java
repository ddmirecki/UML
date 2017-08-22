package sda2.MyPointMyCircle;

/**
 * Created by Daniel on 2017-08-21.
 */
public class MyCircle {

    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    public MyCircle(){
    }

    public MyCircle(int x, int y, int radius){
        center.setX(x);
        center.setY(y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public MyPoint getCenter(){
        return center;
    }
    public void setCenter(MyPoint center){
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){

    }


}
