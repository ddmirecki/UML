package sda2.Threading;

/**
 * Created by Daniel on 2017-09-04.
 */
public class Runner {
    public static void main(String[] args) {
    Runnable[] runners = new Runnable[10];
    Thread[] threads = new Thread[10];

        for (int i = 0; i < runners.length ; i++) {
            runners[i] = new MyRun();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runners[i]);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }


    }

}
