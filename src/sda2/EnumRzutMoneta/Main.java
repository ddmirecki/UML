package sda2.EnumRzutMoneta;

/**
 * Created by Daniel on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {

        Rzut rzut = new Rzut();

        Moneta monetaKomputera = rzut.rzutLosowy();
        Moneta monetaGracza = rzut.zapytajGracza();
        String porownanie = rzut.porownanie(monetaKomputera, monetaGracza);
        System.out.println(porownanie);

    }
}
