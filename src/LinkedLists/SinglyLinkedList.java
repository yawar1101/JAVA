package LinkedLists;

public class SinglyLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void push(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }


    public void append(int new_data) {
        Node newNode = new Node(new_data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = null;

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;

        return;
    }

    public int getLength() {
        Node n = head;

        int len = 0;

        while (n != null) {
            n = n.next;
            len++;
        }

        return len;
    }

    public void reverseList() {
        Node curr = head;
        Node prev = null;
        Node forward = null;


        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        head = prev;
    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    public void getMiddle() {
        Node slwPtr = head;
        Node fstPtr = head;

        while (fstPtr != null && fstPtr.next != null) {
            fstPtr = fstPtr.next.next;
            slwPtr = slwPtr.next;
        }

        System.out.println("The middle element is " + slwPtr.data);

    }




    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.head = new Node(10);

        ll.push(20);
        ll.push(30);

        ll.push(50);

        ll.append(40);

        ll.printList();
//
//        System.out.println();
//        System.out.println("Length of Linked List = " + ll.getLength());
//
//        ll.getMiddle();


        System.out.println();
        System.out.println("After reversing the Linked List");

        ll.reverseList();

        ll.printList();

    }
}
