package sda2.MyPointMyCircle;

/**
 * Created by Daniel on 2017-08-21.
 */
public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint(){

    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x, y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

//    @Override
//    public String toString() {
//        return "MyPoint{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }
    public String toString(){
        return String.format("(%d,%d)", this.x, this.y);
    }

    private double calculateDistance(int x, int y){
        double powX = Math.pow((x - this.x), 2);
        double powY = Math.pow((y - this.y), 2);
        return Math.sqrt(powX + powY);
    }

    public double distance(int x, int y){
        return calculateDistance(x, y);
    }
    public double distance(MyPoint another){
        return calculateDistance(another.x, another.y);
    }
    public double distance(){
        return calculateDistance(0,0);
    }

//    public double distanceAnother(MyPoint another){
//       double distance2 = Math.sqrt((another.x - x)*(another.x -x) + (another.y - y)*(another.y - y));
//       return distance2;
//    }
//    public double distanceZero(){
//        double distanceZero = Math.sqrt(Math.pow((this.x - 0), 2) + Math.pow((this.y -0), 2));
//        return distanceZero;
//    }
}
