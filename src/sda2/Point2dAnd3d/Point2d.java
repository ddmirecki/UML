package sda2.Point2dAnd3d;

/**
 * Created by Daniel on 2017-08-22.
 */
public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2d(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point2d(){

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{x, y};
    }

    public String toString(){
        return new String("(" + x + ", " +y + ")");
    }


}
