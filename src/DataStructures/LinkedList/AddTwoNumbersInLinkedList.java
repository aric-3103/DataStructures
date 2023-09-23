package DataStructures.LinkedList;

/*
Input: l1 = [1,2,4,3], l2 = [5,4,6]
Output: [6,6,0,4]
Time Complexity :- BigO(N+M)) where N is length of l1 & M is length of l2
Space Complexity :- BigO(max(N+M))
 */
public class AddTwoNumbersInLinkedList {
    static ListNode head1, head2;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            val = v;
            next = null;
        }
    }

    public static void addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            current.next = node;
            current = current.next;
        }
    }

    void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        AddTwoNumbersInLinkedList list = new AddTwoNumbersInLinkedList();
        head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        head1.next.next.next = new ListNode(3);
        //list.printList(head1);

        head2 = new ListNode(5);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);
        list.printList(head2);

        System.out.println("Resultant list : ");
        addTwoNumbers(head1, head2);

    }
}
