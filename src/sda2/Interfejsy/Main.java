package sda2.Interfejsy;

/**
 * Created by Daniel on 2017-08-23.
 */
public class Main {

    public static void main(String[] args) {
        IPojazd samochod1 = new Samochod();
        samochod1.jedz();
        samochod1.hamuj();

        ICzterokolowy samochod2 = new Samochod();
        samochod2.jedz();
        samochod2.jedzNaCzolowke();


        IDwukolowy motocykl = new Motocykl();
        motocykl.jedz();
        motocykl.przewrocSie();
        motocykl.hamuj();

        Motocykl motocykl2 = new Motocykl();
        motocykl2.dodajGazu();




        doSomething(motocykl);
    }

    public static void doSomething(IPojazd iPojazd){
        iPojazd.hamuj();
    }
}
