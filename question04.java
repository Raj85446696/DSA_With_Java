class SinglyLinkedlist{
    Node head ; 
    class Node{
        int data ; 
        Node nref ; 
    
        public Node(int data){
            this.data = data ; 
            this.nref = null ; 
           }
    }
    public void Traverse(){
        Node temp = head ; 
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.nref; 
        }
        System.out.println("null");
    }

    public void LenofList(){
        Node temp = head ; 
        int len = 0 ; 
        while(temp != null){
            len++;
            temp = temp.nref;  
        } 
        System.out.println("Lenght of SinglyLinkedList is = "+len);
    }
    public static void main(String[] args) {
        SinglyLinkedlist sl = new SinglyLinkedlist(); 
        sl.head = sl.new Node(10); 
        Node second = sl.new Node(20); 
        Node third = sl.new Node(30); 
        Node fourth = sl.new Node(90);
        sl.head.nref = second ;
        second.nref = third ; 
        third.nref = fourth;

        sl.Traverse();

        // How to find the lenght of singly linked list in java .
        sl.LenofList(); 
       



    }
}