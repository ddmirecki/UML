package sda2.ListElement;

/**
 * Created by Daniel on 2017-09-07.
 */
public class MyList {
    private Element _head;
    private Element _tail;
    private int _counter;

    public Element getElementForward(int data){
        Element p = _head;
        while (p._next != null){
            if(p._data == data){
                break;
            }
            p = p._next;
        }
        return p;
    }
    public Element getElementBack(int data){
        Element p = _tail;
        while (p._prev != null){
            if(p._data == data){
                break;
            }
            p = p._prev;
        }
        return p;
    }

    public void addElementAtBeggining(int data){
        Element p = new Element();
        p._data = data;
        p._prev = null;
        p._next = _head;
        _head = p;
        _counter++;
                if(p._next != null){
                    Element nextOfP = p._next;
                    nextOfP._prev = p;
                }else{
                    _tail = p;
                }
    }

    public void addElementAtEnd(int data){
        Element p = new Element();
        p._data = data;
        p._prev = _tail;
        p._next = null;
        _tail = p;
        _counter++;
        if(p._prev != null){
            p._prev._next = p;
        }else{
            _head = p;
        }
    }
}
