package sda2.ClassIntroduction;

/**
 * Created by Daniel on 2017-08-25.
 */
public class MyTime {

    private int _hour = 0;
    private int _minute = 0;
    private int _second = 0;

    MyTime() {
    }

    MyTime(int hour, int minute, int second) {
    setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        if (hour < 24 && hour >= 0) {
            _hour = hour;
        } else {
            _hour = -10000;
        }
    }

    public void setMinute(int minute) {
        if (minute < 60 && minute >= 0) {
            _minute = minute;
        } else {
            _minute = -10000;
        }
    }

    public void setSecond(int second) {
        if (second < 60 && second >= 0) {
            _second = second;
        } else {
            _second = -10000;
        }
    }

    public int getHour(int hour) {
        return _hour;
    }

    public int getMinute(int minute) {
        return _minute;
    }

    public int getSecond(int second) {
        return _second;
    }

    public MyTime nextSecond() {
        if (_second != 59) {
            _second = _second + 1;
        } else {
            nextMinute();
            _second = 0;
        }
        return this;
    }

    public MyTime nextMinute() {
        if (_minute != 59) {
            _minute = _minute + 1;
        } else {
            nextHour();
            _minute = 0;
        }
        return this;
    }

    public MyTime nextHour() {
        _hour = (_hour + 1) % 24;
        return this;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", _hour, _minute, _second);
    }
}
