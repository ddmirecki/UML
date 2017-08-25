package sda2.Basket;

/**
 * Created by Daniel on 2017-08-23.
 */
public abstract class MusicCD implements IProduct {

    protected static final int price = 0;
    protected static final String title = null;

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setProductName(String name) {

    }

    @Override
    public String getProductName() {
        return null;
    }

    public static String getTitle() {
        return title;
    }

    @Override
    public void setPrice(int price) {

    }
}
