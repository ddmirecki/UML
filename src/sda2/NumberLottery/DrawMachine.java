package sda2.NumberLottery;

import java.util.Random;

/**
 * Created by Daniel on 2017-09-07.
 */
public class DrawMachine {
    int min = -100;
    int max = 100;

    public NumbersResult calculateValues(int howManyNumbers) {
        Random random = new Random();
        int positiveCounter = 0;
        int negativeCounter = 0;
        int minValue = 99;
        int maxValue = -99;
        for (int i = 0; i < howManyNumbers; i++) {
            int generatedNumber = (random.nextInt(max * 2) + min);
            if (generatedNumber > 0) {
                positiveCounter++;
                if (generatedNumber > maxValue) {
                    maxValue = generatedNumber;
                }
            }
            if (generatedNumber <= 0) {
                negativeCounter++;
                if (generatedNumber <= minValue) {
                    minValue = generatedNumber;
                }
            }
        }
        String average = calculateAverage(positiveCounter, negativeCounter);
        return new NumbersResult(average, minValue, maxValue);

    }

    public String calculateAverage(int positiveDraws, int negativeDraws) {
        String average = new String();
        if (negativeDraws > 0) {
            return average = "średnia to: " + positiveDraws + ":" + negativeDraws;
        }
        return average;
    }




}
