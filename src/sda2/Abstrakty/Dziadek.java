package sda2.Abstrakty;

/**
 * Created by Daniel on 2017-08-23.
 */
public class Dziadek extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.println("za moich czasów...\n");
    }

    @Override
    public void walczOMiejsceWAutobusie() {
        System.out.println("Waali laską po nogach");
    }
    public void zapalPapierosa(){
        System.out.println("jara dziad szluga");
    }

    @Override
    public void upieczSzarlotke() {
        System.out.println("gowno nie szarlotka");
    }
}
