package sda2.ThreadList;

/**
 * Created by Daniel on 2017-09-04.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ListThreads lt = new ListThreads();
        ListThreadsConcurency ltc = new ListThreadsConcurency();

        Thread t1 = new Thread(lt);
        Thread t2 = new Thread(lt);

        long currentTime = System.currentTimeMillis();
        t1.run();
        t1.run();
        t1.join();
        t2.join();
        System.out.println(System.currentTimeMillis() - currentTime);

    }
}
