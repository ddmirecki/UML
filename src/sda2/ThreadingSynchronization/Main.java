package sda2.ThreadingSynchronization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Daniel on 2017-09-04.
 */
public class Main {
    public List<Integer> counter = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.doWork();

    }

    public  void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.add(i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.add(i);
                }
            }
        });
        t1.run();
        t2.run();

        t1.join();
        t2.join();

        System.out.println(counter);

    }
}
