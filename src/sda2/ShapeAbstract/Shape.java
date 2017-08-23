package sda2.ShapeAbstract;

/**
 * Created by Daniel on 2017-08-23.
 */
public abstract class Shape {

    protected String _color = "red";
    protected boolean _filled = true;

    public Shape(){

    }
    public Shape(String color, boolean filled){
        _color = color;
        _filled = filled;
    }

    public String getColor(){return _color;}
    public void setColor(String color){
        _color = color;
    }
    public Boolean IsFilled(){return _filled;}
    public void IsFilled(boolean filled){
        _filled = filled;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A shape with color of ");
        sb.append(_color).append(" and ");
        if(_filled){
            sb.append("filled");
        }else{
            sb.append("not filled");
        }
        return sb.toString();
    }
}
