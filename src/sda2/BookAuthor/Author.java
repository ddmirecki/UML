package sda2.BookAuthor;

/**
 * Created by Daniel on 2017-08-21.
 */
public class Author {

    private String _name;
    private String _email;
    private Character _gender;

    public Author(String name, String email, Character gender){
        _name = name;
        _email = email;
        _gender = gender;
    }

    public String getName(){
        return _name;
    }
    public String getEmail(){
        return _email;
    }
    public Character getGender(){
        return _gender;
    }

    public void setEmail(String email){
        _email = email;
    }
    public void setName(String name){
        _name = name;
    }
    public void setGender(Character gender){
        _gender = gender;
    }

    public String toString(){
        return String.format("Author[name=%s,email,%s,gender=%c]", _name, _email, _gender);
    }

}
