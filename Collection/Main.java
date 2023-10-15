package Collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array List

        ArrayList<String> list = new ArrayList<String>();
        list.add("harsh");
        list.add("Ravi");
        list.add("John");

        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("harsh");
        list1.add("Ravi");
        list1.add("John");

//        System.out.println(list1);
//        list1.set(2,"Something");

        System.out.println(list1);

//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        ArrayList<String> list1 = new ArrayList<String>(20);
//
//        for(int i = 0; i < 20; i++){
//            list1.add(i,"index " + (i+1));
//        }
//
//
//        Iterator itr2 = list1.iterator();
//        while(itr2.hasNext()){
//            System.out.println(itr2.next());
//        }
    }
}
