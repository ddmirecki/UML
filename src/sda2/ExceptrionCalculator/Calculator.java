package sda2.ExceptrionCalculator;

/**
 * Created by Daniel on 2017-09-06.
 */
public class Calculator {
    public static void main(String[] args) {
        int sum = 0;
        int temp = 0;

        for (String s : args) {
            try {
                temp = Integer.parseInt(s);
            } catch (IllegalArgumentException e) {
                System.out.println("znaki " + s + " nie sa liczba");
                temp = 0;
            }
            sum += temp;



        }
        System.out.println(sum);
    }
}