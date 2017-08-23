package sda2.Abstrakty;

/**
 * Created by Daniel on 2017-08-23.
 */
public class Babcia extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.println("Zostaw ziemmniaki, a mięso zjedz!\n");
    }

    @Override
    public void walczOMiejsceWAutobusie() {
        System.out.println("walę torbą w łęb");
    }

    @Override
    public void upieczSzarlotke() {
        System.out.println("super szarlotka");
    }
}
