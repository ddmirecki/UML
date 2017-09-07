package sda2.NumberLottery;

/**
 * Created by Daniel on 2017-09-07.
 */
public class NumbersResult {
    private int _min;
    private int _max;
    private String _average;

    public NumbersResult(String average, int min, int max){
        _average = average;
        _min = min;
        _max = max;
    }

    public String get_average() {
        return _average;
    }

    public void set_average(String _average) {
        this._average = _average;
    }

    public int get_min() {
        return _min;
    }

    public void set_min(int min) {
        _min = min;
    }

    public int get_max() {
        return _max;
    }

    public void set_max(int max) {
        _max = max;
    }

    @Override
    public String toString() {
        return "NumbersResult{" +
                "average=" + _average +
                ", min=" + _min +
                ", max=" + _max +
                '}';
    }
}
