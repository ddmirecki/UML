package sda2.EnumRzutMoneta;

import java.util.Scanner;

/**
 * Created by Daniel on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {

        Rzut rzut = new Rzut();
        boolean runda = true;
        while(runda) {
            String czyJeszczeRaz = "Rzucasz jeszcze raz? T/N";
            Moneta monetaKomputera = rzut.rzutLosowy();
            Moneta monetaGracza = rzut.zapytajGracza();
            String porownanie = rzut.porownanie(monetaKomputera, monetaGracza);
            System.out.println(porownanie);
            System.out.println(czyJeszczeRaz);
            String scanner = new Scanner(System.in).nextLine().toLowerCase();
            if(scanner.equals("t")){
                runda = true;
            }else{
                runda = false;
            }
        }
    }
}
