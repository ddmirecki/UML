package sda2.Threading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Daniel on 2017-09-04.
 */
public class MyRun implements Runnable {
    private List<String> _names;

//    public MyRun(List<String> names){
//        _names = names;
//        namesGenerator();
//    }

    public MyRun() {
        _names = new ArrayList<>();
        namesGenerator();
    }

    public void namesGenerator() {
        _names.add("Super Imię " + new Random().nextInt(1000));
    }

    @Override
    public void run() {
        while (true) {

            for (int i = 0; i < _names.size(); i++)
            {System.out.println(_names.get(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
