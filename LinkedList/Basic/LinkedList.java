package LinkedList.Basic;

public class LinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void insert_first(T val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = node;
        }

        size += 1;
    }

    public void insert_last(T val) {
        Node node = new Node(val);
        if (head == null) {
            // If the list is empty, set both head and tail to the new node
            head = node;
            tail = node;
        } else {
            // Traverse the list to find the last node
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            // Set the next of the last node to the new node
            temp.next = node;
            // Update the tail to the new node
            tail = node;
        }
        size += 1;
    }

    public void delete_first(){
        if(head == null){
            System.out.println("List is Empty");
        }else{
            head = head.next;
            size--;
        }

    }

    public void delete_last(){
       if(head == null){
           System.out.println("List is Empty");
       }else{
           Node temp = head;
           while((temp.next).next != null ){
               temp = temp.next;
           }
           temp.next = null;
           tail = temp;
           size--;
       }
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            if(temp.next == null){
              System.out.print(temp.val);
            }else{
                System.out.print(temp.val + " --> ");
            }
            temp = temp.next;
        }

    }

    public int size(){
        return this.size;
    }

    private class Node <T>{
        private T val;
        private Node next;

        public Node(T val){
            this.val = val;
        }

        public Node(T val, Node next){
            this.val = val;
            this.next = next;
        }

    }


}
