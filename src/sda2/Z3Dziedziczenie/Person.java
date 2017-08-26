package sda2.Z3Dziedziczenie;

/**
 * Created by Daniel on 2017-08-26.
 */
public class Person {

    private String _name;
    private String _address;

    public Person(String name, String address){
        _name = name;
        _address = address;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Person[name= ").append(_name).append(", addresss= ").append(_address).append("]");
        return sb.toString();
    }
}
