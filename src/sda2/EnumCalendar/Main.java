package sda2.EnumCalendar;

/**
 * Created by Daniel on 2017-08-24.
 */
public class Main {

    public static void main(String[] args) {
        for(Days days: Days.values()){
            System.out.printf("dzień to: %s %s\n", days.getDays(), days.next().getDays());
        }
    }
}
