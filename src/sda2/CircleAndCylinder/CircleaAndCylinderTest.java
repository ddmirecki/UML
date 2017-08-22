package sda2.CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Daniel on 2017-08-22.
 */
public class CircleaAndCylinderTest {

    @Test
    public void testIfCylinderIsCreated(){
        Cylinder cylinder = new Cylinder(10, 5, "blue");

        Assert.assertEquals(10, cylinder.getRadius(), 0.1);
        Assert.assertEquals(5, cylinder.getHeight(), 0.1);
        Assert.assertEquals("blue", cylinder.getColor());
    }
    @Test
    public void isAreaCalculatedCorrectly(){
        Cylinder cylinder = new Cylinder(10, 5);
        double area = cylinder.getArea();
        Assert.assertEquals(314.15, area, 0.1);
    }
    @Test
    public void isVolumeCalculatedCorrectly(){
        Cylinder cylinder = new Cylinder(10, 5);
        double volume = cylinder.getVolume();
        Assert.assertEquals(1570.79, cylinder.getVolume(), 0.1);
    }
    @Test
    public void isColorSetCorrectly(){
        Cylinder cylinder = new Cylinder(10, 5, "red");

        Assert.assertEquals("red", cylinder.getColor());
    }





}
