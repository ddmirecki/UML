package sda2.GenericsFruitBasket;

/**
 * Created by Daniel on 2017-09-06.
 */
public class Basket <T extends Plants> {
    private T _thing;

    public T get_thing() {
        return _thing;
    }

    public void set_thing(T thing) {
       _thing = thing;
    }

    public String getName(){
        return _thing.nameOfPlant();
    }
    public String getType(){
        return _thing.typeOfPlant();
    }

    public int getSize(){
        return _thing.sizeOfPlant();
    }
}
