package sda2.StringCountingElements;

/**
 * Created by Daniel on 2017-09-07.
 */
public class Main {
    public static void main(String[] args) {

        String s = "a AlA ma kota 4";
        int solution = checkForLetter(s, 'k');
        System.out.println(solution);


    }


    public static int checkForLetter (String input, char checker){
        char[] chars = input.toLowerCase().toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == checker){
                counter++;
            }
        }
        return counter;

    }
}
