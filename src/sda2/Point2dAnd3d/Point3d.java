package sda2.Point2dAnd3d;

/**
 * Created by Daniel on 2017-08-22.
 */
public class Point3d extends Point2d {
    private float z = 1.0f;

    public Point3d(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public Point3d(){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        x = getX();
        y = getY();
        this.z = z;
    }

//    public float getXYZ(){
//
//    }

}
