package sda2.Generics;

/**
 * Created by Daniel on 2017-09-06.
 */
public class Main {
    public static void main(String[] args) {
        Shoes shoes = new Shoes();
        Socks socks = new Socks();
        Trousers trousers = new Trousers();
        Hat hat = new Hat();
        Suitcase<Trousers> suitcase = new Suitcase<>();
        suitcase.setThing(trousers);
        System.out.println(suitcase.getDescription());
        System.out.println(suitcase.getThingSize());


    }
}
