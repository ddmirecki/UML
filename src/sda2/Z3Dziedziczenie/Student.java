package sda2.Z3Dziedziczenie;

/**
 * Created by Daniel on 2017-08-26.
 */
public class Student extends Person {

    private String _program;
    private int _year;
    private double _fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        _program = program;
        _year = year;
        _fee = fee;
    }

    public String getProgram() {
        return _program;
    }

    public void setProgram(String program) {
        _program = program;
    }

    public int getYear() {
        return _year;
    }

    public void setYear(int year) {
        _year = year;
    }

    public double getFee() {
        return _fee;
    }

    public void setFee(double fee) {
        _fee = fee;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString())
                .append(",program= ")
                .append(_program)
                .append(",year= ")
                .append(_year)
                .append(",fee= ")
                .append(_fee)
                .append("]");
        return sb.toString();
    }

}
