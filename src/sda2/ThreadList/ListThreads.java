package sda2.ThreadList;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Daniel on 2017-09-04.
 */
public class ListThreads implements Runnable {

    private ArrayList<Integer> _stageOne = new ArrayList<>();
    private ArrayList<Integer> _stageTwo = new ArrayList<>();
    private Random random = new Random();
    private int _counter;

    public void stageOne() throws InterruptedException {
        _stageOne.add(random.nextInt());
        Thread.sleep(1);
        _counter++;
    }

    public synchronized void stageTwo() throws InterruptedException {
        _stageTwo.add(random.nextInt());
        Thread.sleep(1);
        _counter++;
    }

    public synchronized void process() throws InterruptedException {
        while (_counter <1000){

            stageOne();
            stageTwo();
        }
    }

    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
