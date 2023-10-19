package Queue;

import Queue.Basic.Queue;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.enQueue(5));
        q.enQueue(29);
        q.enQueue(23);
        q.enQueue(38);
        System.out.println(q.inFront());
    }

}
