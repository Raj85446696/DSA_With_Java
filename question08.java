class MergeSll {

    Node head;

    class Node {
        int data;
        Node nref;

        Node(int data) {
            this.data = data;
            this.nref = null;
        }
    }

    void InsertNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.nref = head;
            head = newNode;
        }
    }

    /*
     a = 1 --> 3 --> 5 --> null
     b = 2 --> 4 --> 6 --> null

     result = 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> null
     */
    // Keep MergeNode as an instance method
    public Node MergeNode(Node a, Node b) {
        Node dummy = new Node(0);  // Initialize dummy node with value 0
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.nref = a;
                a = a.nref;
            } else {
                tail.nref = b;
                b = b.nref;
            }
            tail = tail.nref;
        }
        if (a == null) {
            tail.nref = b;
        } else {
            tail.nref = a;
        }

        return dummy.nref;
    }

    public void Traverse() {
        if (head == null) {
            System.out.println("node not exists");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.nref;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        MergeSll s1 = new MergeSll();
        MergeSll s2 = new MergeSll();
        
        // Inserting nodes into first linked list (sorted)
        s1.InsertNode(5);
        s1.InsertNode(3);
        s1.InsertNode(2);

        // Inserting nodes into second linked list (sorted)
        s2.InsertNode(6);
        s2.InsertNode(4);
        s2.InsertNode(1);

        // Traversing and printing both lists
        System.out.print("List 1: ");
        s1.Traverse();
        System.out.print("List 2: ");
        s2.Traverse();

        // Merging two sorted lists using an instance method
        MergeSll result = new MergeSll();
        result.head = s1.MergeNode(s1.head, s2.head);  // Call instance method

        // Traversing and printing the merged list
        System.out.print("Merged List: ");
        result.Traverse();
    }
}
