package sda2.EnumRzutMoneta;


import java.util.Random;
import java.util.Scanner;

/**
 * Created by Daniel on 2017-08-28.
 */
public class Rzut {

    public Moneta rzutLosowy(){
        int los = new Random().nextInt(1000);

        if (los % 2 == 0) {
            return Moneta.ORZEL;
        } else  {
            return Moneta.RESZKA;
        }
    }

    public Moneta zapytajGracza(){
        String pytanie = "Wybierz orzel czy reszka? Orzeł = o, Reszka = r";
        System.out.println(pytanie);
        String odp = new Scanner(System.in).nextLine().toLowerCase();
        if(odp.equals("o")){
            return Moneta.ORZEL;
        }else{
            return Moneta.RESZKA;
        }
    }
    public String porownanie(Moneta monetaKomputera, Moneta monetaGraczaa){

        if(monetaKomputera==monetaGraczaa){
            return new String("zgadłeś!");
        }else{
            return new String("nie zgadłeś!");
        }

    }

}
