class Node{
    int data;
    Node next;
    Node prev ; 
    public Node(int data){
        this.data = data ; 
        this.next = null ; 
        this.prev = null ; 
    }
}

public class doublyLinkedlist {
    Node head;
    public doublyLinkedlist(){
        head = null ;
    }

    //---- Insert At Begin of Doubly Linked list ----//
    public void InsertatBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode ;
            return;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    public void InsertatEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode ;
            return;
        }else{
            while(head.next!= null){
                head = head.next ;
            }head.next = newNode; 
        }
        }


    //---- Traversing of Doubly Linked list ----//

    public void Traverse(){
        if(head == null){
            System.out.println("LinkedList is Empty.");
            return; 
        }
        Node current = head ; 
        while(current != null){
            System.out.print(current.data+" <-> ");
            current = current.next ; 
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        doublyLinkedlist dl = new doublyLinkedlist(); 
        dl.InsertatBegin(90);
        //dl.InsertatBegin(190);
        // dl.InsertatBegin(290);
        dl.InsertatEnd(999);
        dl.InsertatEnd(799);
        dl.Traverse();
    }
}
