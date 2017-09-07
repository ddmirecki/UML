package sda2.ExceptionStringArraySearch;

/**
 * Created by Daniel on 2017-09-06.
 */
public class Search {
    public String searchArray(String[] array, String string){
        for (int i = 0; i < array.length ; i++) {
            if(string.equals(array[i])){
                return string;
            }

        }
        throw new IllegalArgumentException("nie ma takiego elementu");
    }
}
