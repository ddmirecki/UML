package sda2.Interfejsy;

/**
 * Created by Daniel on 2017-08-23.
 */
public class Motocykl implements IDwukolowy {
    @Override
    public void jedz() {
        System.out.println("jedzie pojeb");
    }

    @Override
    public void hamuj() {
        System.out.println("motor wreszcie hamuje");
    }

    @Override
    public void przewrocSie() {
        System.out.println("Dawca szpiku poległ!");
    }

    public void dodajGazu(){
        System.out.println("próbuje dodawać gazu tym gównem");
    }
}
