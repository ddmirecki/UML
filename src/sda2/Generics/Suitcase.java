package sda2.Generics;

/**
 * Created by Daniel on 2017-09-06.
 */
public class Suitcase <T extends Cothes & ICanBeFolded  > {
    private T _thing;

    public T getThing(){
        return _thing;
    }

    public void setThing(T thing){
        _thing = thing;
    }

    public String getThingName(){
        return _thing.getName();
    }

    public String getDescription(){
        return _thing.getDescription();
    }

    public String getThingSize(){
        return _thing.getSize();
    }

}
