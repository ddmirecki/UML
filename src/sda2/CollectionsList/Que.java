package sda2.CollectionsList;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Daniel on 2017-09-05.
 */
public class Que {
    public static void main(String[] args) {
        QueCustomer customer1 = new QueCustomer("janek", "woda");
        QueCustomer customer2 = new QueCustomer("maciek", "koniak");
        QueCustomer customer3 = new QueCustomer("arek", "gin");

        ArrayQueue<QueCustomer> que = new ArrayQueue<>(3);
        que.add(customer1);
        que.add(customer2);
        que.add(customer3);
        ArrayDeque<QueCustomer> deque = new ArrayDeque<>();
        deque.add(customer1);
        deque.add(customer2);
        deque.add(customer3);


        System.out.println(que.remove(0));

        System.out.println(deque);
        while (!deque.isEmpty()){
            QueCustomer currentCustomer = deque.removeFirst();
            System.out.println(currentCustomer.getName());
            System.out.println(currentCustomer.getShoppingList());
        }
        System.out.println(deque);


    }
}
