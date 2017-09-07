package sda2.CollectionsList;

/**
 * Created by Daniel on 2017-09-05.
 */
public class QueCustomer {

    private String _imie;
    private String _shoppingList;

    public QueCustomer(String imie, String shoppingList){
       _imie = imie;
       _shoppingList = shoppingList;
    }

    public String getName(){
        return _imie;
    }
    public String getShoppingList() {
        return _shoppingList;
    }

@Override
public String toString() {
    return "QueCustomer{" +
            "_imie='" + _imie + '\'' +
            ", _shoppingList='" + _shoppingList + '\'' +
            '}';
}


}
