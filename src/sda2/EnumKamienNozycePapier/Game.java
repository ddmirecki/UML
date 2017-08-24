package sda2.EnumKamienNozycePapier;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Daniel on 2017-08-24.
 */
public class Game {

    public Move playerChoice() {
        System.out.println("Podaj literę: R, P, S)");
        String choice = new Scanner(System.in).nextLine().toLowerCase();

        if(choice.equals("s")){
            return Move.SCIS;
        }else if(choice.equals("p")){
            return Move.PAPER;
        }else if(choice.equals("r")){
            return Move.STONE;
        }else
            return Move.Q;
    }

    public Move computerMove() {
        int lotto = new Random().nextInt(3);
        if(lotto==0){
            return Move.PAPER;
        }else if(lotto==1){
            return Move.SCIS;
        }else{
            return Move.STONE;
        }
    }

    public char checkVictory(Move playerChoice, Move computerMove){
        if(playerChoice.equals(Move.PAPER) && computerMove.equals(Move.PAPER)){
            return 'R';
        }if(playerChoice.equals(Move.PAPER) && computerMove.equals(Move.SCIS)){
            return 'P';
        }if(playerChoice.equals(Move.PAPER) && computerMove.equals(Move.STONE)){
            return 'W';
        }if(playerChoice.equals(Move.SCIS) && computerMove.equals(Move.PAPER)){
            return 'W';
        }if(playerChoice.equals(Move.SCIS) && computerMove.equals(Move.SCIS)){
            return 'R';
        }if(playerChoice.equals(Move.SCIS) && computerMove.equals(Move.STONE)){
            return 'P';
        }if(playerChoice.equals(Move.STONE) && computerMove.equals(Move.PAPER)){
            return 'P';
        }if(playerChoice.equals(Move.STONE) && computerMove.equals(Move.SCIS)){
            return 'W';
        }else{
            return 'R';
        }

    }


}
