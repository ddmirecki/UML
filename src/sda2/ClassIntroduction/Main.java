package sda2.ClassIntroduction;

/**
 * Created by Daniel on 2017-08-25.
 */
public class Main {
    public static void main(String[] args) {

        MyTime myTime = new MyTime(23, 59, 59);
        System.out.println(myTime);
        myTime.nextMinute();
        System.out.println(myTime);

        String s = "0123456789";
        String[] split = s.split("");
        System.out.println(split[1]);
    }
}
