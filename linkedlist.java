class Node{
    int data; 
    Node next;

    Node(int data){
        this.data = data ; 
        this.next = null; 
    }
}

class LinkedList{
    Node head ; 
    LinkedList(){
        this.head = null ; 
    }

public void addToFirst(int data){
    Node newNode = new Node(data);
    newNode.next = head ; 
    head = newNode ; 
}

public void Printlist(){
    Node cur = head ; 
    while(cur!=null){
        System.out.print(cur.data+"->");
        cur = cur.next ; 
    }
    System.out.println("null");
}
public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.addToFirst(12);
    l.addToFirst(34);
    l.addToFirst(56);

    l.Printlist();
}
}