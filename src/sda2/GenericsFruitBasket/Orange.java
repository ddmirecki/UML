package sda2.GenericsFruitBasket;

/**
 * Created by Daniel on 2017-09-06.
 */
public class Orange extends Plants implements IThisIsFruit {
    @Override
    public String typeOfPlant() {
        return "fruit";
    }

    @Override
    public String nameOfPlant() {
        return "orange";
    }

    @Override
    public int sizeOfPlant() {
        return 2;
    }
}
