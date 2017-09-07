package sda2.BracketsCorrectnessChecker;

/**
 * Created by Daniel on 2017-09-07.
 */
public class Brackets {

    private String _math;

    public Brackets(){

    }

    public boolean bracketsChecker(String math){
        char[] chars = math.toCharArray();
        int leftBracket = 0;
        int rightBracket = 0;
        boolean solution;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '('){
                leftBracket++;
            }if(chars[i] == ')'){
                rightBracket++;
            }
        }
        if(leftBracket==rightBracket){
            solution = true;
        }else{
            solution = false;
        }
        return solution;
    }


    public String get_math() {
        return _math;
    }

    public void set_math(String math) {
        _math = math;
    }
}
