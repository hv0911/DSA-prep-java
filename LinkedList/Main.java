package LinkedList;

import LinkedList.Basic.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList  LL = new LinkedList<String>();
        LL.insert_first("Harsh");
        LL.insert_first("Verma");
        LL.insert_first("Here");
        LL.insert_last("Last_Index");
        LL.display();
//        LL.delete_first();
        System.out.println("Size" +  LL.size());
        LL.display();
        LL.delete_last();
        System.out.println("Size" + LL.size());
        LL.display();
    }
}
