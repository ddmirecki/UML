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
        dziadek.biegnijDoSklepu(100, 10);
        dziadek.upieczSzarlotke();




        Dziadek dziad = new Dziadek();
        dziad.zapalPapierosa();
        dziad.biegnijDoSklepu(150, 10);
        dziad.krzyczNaDzieci();
        dziad.walczOMiejsceWAutobusie();
        dziad.upieczSzarlotke();

        Emeryt babcia = new Babcia();
    }
}
