package Stack.Basics;

import java.rmi.server.ExportException;

public class Stack<T> {

    private int ptr = -1;
    protected T[] data;
    private static final int DEFAULT_VALUE = 10;

    private int size;

    public Stack(){
        this(DEFAULT_VALUE);
    }

    public Stack(int size){
        this.data = (T[]) new  Object[size];
    }

    public boolean push(T val){
        if(isFull()){
            System.out.println("Stack Is Full");
            return false;
        }else{
            ptr++;
            data[ptr] = val;
            return true;
        }

    }

    public T pop()  throws Exception{
        if(isEmpty()){
            throw new Exception("the stack is Empty");
        }

        int temp = ptr;
        ptr--;
        return data[temp];
    }

    public void display() throws Exception {

        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }

        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return ptr == data.length -1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

}
