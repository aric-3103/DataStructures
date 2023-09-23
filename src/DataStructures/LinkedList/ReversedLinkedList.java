package DataStructures.LinkedList;

public class ReversedLinkedList {
    public Node head;

    public static class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }

        public static void printLinkedList(ReversedLinkedList linkedList) {
            Node h = linkedList.head;
            while (linkedList.head != null) {
                System.out.print(linkedList.head.data + " ");
                linkedList.head = linkedList.head.next;
            }
            System.out.println();
            linkedList.head = h;
        }

        public static void reverseLinkedList(ReversedLinkedList linkedList) {
            Node previous = null;
            Node current = linkedList.head;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            linkedList.head = previous;
        }

        public static void main(String[] args) {
            ReversedLinkedList myLinkedList = new ReversedLinkedList();
            myLinkedList.head = new Node(1);
            myLinkedList.head.next = new Node(2);
            myLinkedList.head.next.next = new Node(3);
            myLinkedList.head.next.next.next = new Node(4);
            myLinkedList.head.next.next.next.next = new Node(5);
            printLinkedList(myLinkedList);
            reverseLinkedList(myLinkedList);
            printLinkedList(myLinkedList);

        }


    }
}

