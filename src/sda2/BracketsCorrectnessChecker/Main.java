package sda2.BracketsCorrectnessChecker;

/**
 * Created by Daniel on 2017-09-07.
 */
public class Main {
    public static void main(String[] args) {

        Brackets brackets = new Brackets();
        String math = "2 * (33.4 - (7)/2)*(a-2)/(b-1)))";
        String math2 = "(2 * (33.4 - (7)/2)*(a-2)/(b-1))";
        boolean b = brackets.bracketsChecker(math);
        boolean b1 = brackets.bracketsChecker(math2);
        System.out.println(b);
        System.out.println(b1);


    }
}
