package Lists;

class Node{
    int data;
    Node next;
}

public class LinkedList {
    Node head = null;

    public void addElement(int data){
        // can directly insert data while making a new node like Node newNode = new Node(data); or in a new line
        Node newNode = new Node();
        newNode.data = data;

        Node current = head;

        if (head == null){
            head = newNode;
        }
        else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void printValues(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
