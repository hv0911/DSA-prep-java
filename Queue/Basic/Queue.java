package Queue.Basic;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<Integer> data;
    private int p_start;

    public Queue(){
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    public boolean enQueue(int element){
        data.add(element);
        return true;
    }

    public boolean deQueue(int element){
        if(isEmpty() == true){
            return false;
        }
        p_start++;
        return true;
    }
    public boolean isEmpty(){
        return p_start >= p_start;
    }

    public int inFront(){
        return data.get(p_start);
    }

}
