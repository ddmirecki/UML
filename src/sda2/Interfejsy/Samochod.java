package sda2.Interfejsy;

/**
 * Created by Daniel on 2017-08-23.
 */
public class Samochod implements ICzterokolowy {
    @Override
    public void jedz() {
        System.out.println("Jadę!\n");
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuję!\n");
    }

    @Override
    public void jedzNaCzolowke() {
        System.out.println("Jadę na czołówkę!\n");
    }
}
