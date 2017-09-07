package sda2.CollectionsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Daniel on 2017-09-05.
 */
public class Main {
    public static void main(String[] args) {
        int[] intsTab = new int[10];
        Integer[] integerTab = new Integer[10];

        for (int i = 0; i < intsTab.length ; i++) {
            intsTab[i] = i;
        }
        for (int i = 0; i < integerTab.length; i++) {
            integerTab[i] = i;
        }

        System.out.println(Arrays.toString(intsTab));
        System.out.println(Arrays.toString(integerTab));
        System.out.println("___________________");

        List<int[]> ints = Arrays.asList(intsTab);
        List<Integer> integers = Arrays.asList(integerTab);

        for (int[] solution : ints) {
            System.out.println(Arrays.toString(solution));
        }

        System.out.println(integers);

    }
}
