package sda2.Abstrakty;

/**
 * Created by Daniel on 2017-08-23.
 */
public class Main {
    public static void main(String[] args) {
        Emeryt.glupiaMetoda();

        Emeryt dziadek = new Dziadek();
        dziadek.walczOMiejsceWAutobusie();
        dziadek.krzyczNaDzieci();

        Dziadek dziad = new Dziadek();
        dziad.zapalPapierosa();

        Emeryt babcia = new Babcia();
    }
}
