package sda2.NumberLottery;

import java.util.Calendar;
import java.util.Random;
import java.util.Set;

/**
 * Created by Daniel on 2017-09-07.
 */
public class Main {
    public static void main(String[] args) {
        DrawMachine drawMachine = new DrawMachine();
        Random random = new Random();
        int solution = (random.nextInt(100 * 2) - 100);
        System.out.println(solution);

        NumbersResult numbersResult = drawMachine.calculateValues(10);
        System.out.println(numbersResult);


    }
}
