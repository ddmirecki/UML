package sda2.CollectionsList;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Daniel on 2017-09-05.
 */
public class TreeSetHashSet {
    public static void main(String[] args) {
        String nazwisko = " kowalski ";
        String nazwisko2 = " nowak ";
        String nazwisko3 = " dupa ";
        String nazwisko4 = " oszust ";
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add(nazwisko);
        treeSet.add(nazwisko2);
        treeSet.add(nazwisko3);
        treeSet.add(nazwisko4);
        for (String s : treeSet) {
            System.out.println(s);
        }

        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            integers.add(i*3);
        }

        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            integerTreeSet.add(i*3);
        }
    Integer closestTo5 = integerTreeSet.ceiling(5);
        System.out.println(closestTo5);
        System.out.println(integers);
    }
}
