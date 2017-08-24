package sda2.EnumKamienNozycePapier;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Daniel on 2017-08-24.
 */
public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        int vic = 0;
        int draw = 0;
        int loose = 0;
        while (true){


            Move player = game.playerChoice();
            Move computer = game.computerMove();
            char victory = game.checkVictory(player, computer);

            System.out.println(victory);

            if(victory=='W'){
                vic++;
            }if(victory=='P'){
                loose++;
            }else if(victory=='R'){
                draw++;
            }
            System.out.println("zwyciestwa: " + vic + " przegrane: " + loose + " remisy: " + draw);
        }

    }
}
