class SinglyLinkedList1 {
    ListNode head;

    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert nodes into the linked list
    public void InsertNode() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
    }

    public void reverseNode(int t) {
        if (head == null || t <= 0) {
            return;
        } else {
            head = reverseList(head, t);
        }
    }

    public ListNode reverseList(ListNode head, int t) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        int count = 0;


        while (current != null && count < t) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (head != null) {
            head.next = current;
        }

        return prev;
    }

    public void Traverse() {
        if (head == null) {
            System.out.println("ListNode is empty");
            return;
        } else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList1 s = new SinglyLinkedList1();
        s.InsertNode();
        s.reverseNode(2);
        s.Traverse();
    }
}
