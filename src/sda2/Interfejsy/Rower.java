package sda2.Interfejsy;

/**
 * Created by Daniel on 2017-08-23.
 */
public class Rower implements IDwukolowy {
    @Override
    public void jedz() {
        System.out.println("Jadę rowerem!");
    }

    @Override
    public void hamuj() {
        System.out.println("hamuję rowerem");
    }

    @Override
    public void przewrocSie() {
        System.out.println("rower próbuje się wyglebić");
    }
}
