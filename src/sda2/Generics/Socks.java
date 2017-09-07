package sda2.Generics;

/**
 * Created by Daniel on 2017-09-06.
 */
public class Socks extends Cothes implements ICanBeFolded {
    @Override
    public String getDescription() {
        return "black socks";
    }

    @Override
    public String getName() {
        return "socks";
    }

    @Override
    public String getSize() {
        return "42";
    }
}
