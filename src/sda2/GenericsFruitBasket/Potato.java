package sda2.GenericsFruitBasket;

/**
 * Created by Daniel on 2017-09-06.
 */
public class Potato extends Plants {
    @Override
    public String typeOfPlant() {
        return "vegetable";
    }

    @Override
    public String nameOfPlant() {
        return "potato";
    }

    @Override
    public int sizeOfPlant() {
        return 2;
    }
}
