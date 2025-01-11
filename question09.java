class doublyLinkedlist{
    int length;
    Node head ; 

    class Node{
        int data ; 
        Node pref ; 
        Node nref ; 

        Node(int data){
            this.pref = null ; 
            this.data = data ; 
            this.nref = null ; 
        }

    }

    // Method to Find whether Node is Empty or not
    public boolean Is_empty(){
        return head==null ; 
    }

    // Method to find the lenght of Node
    public int Length() {
        length = 0; 
        Node temp = head;
        while (temp != null) {
            length += 1; 
            temp = temp.nref; 
        }
        return length;
    }
    

    // 1. Insert at begin of Node 
    public void InsertBegin(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode ; 
            newNode.nref = newNode.pref = null;
        }else{
            newNode.nref = head ; 
            head.pref = newNode ; 
            head = newNode ; 
        }

    }

    //2. Insert at anyPosition of Node
    public void InsertatPos(int data,int Pos){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode; 
        }if(Pos==1){
            InsertBegin(data);
        }else{
            Node temp = head ; 
            for(int i = 1 ; i<Pos-1 ; i++){
                temp = temp.nref ; 
            }
            Node temp2 = temp.nref ; 
            temp.nref = newNode; 
            newNode.nref = temp2;
            temp2.pref = newNode ;
            newNode.pref = temp;
        }
    }

    // //3 Insert a Node after a Node
    // public void InsertNodeafter(int data , int value){
    //     Node newNode = new Node(data);
    //     if(head==null){
    //         head = newNode; 
    //     }else{
    //         Node temp = head ; 
    //         for(int i = 1 ; i<length-1 ;i++){
    //             if(temp.data==value){
    //                 Node temp2 = temp.nref ; 
    //                 temp.nref = newNode; 
    //                 newNode.nref = temp2; 
    //                 if(temp2!=null){
    //                     temp2.pref = newNode ; 
    //                 }newNode.pref = temp; 
    //                 break ; 
    //             }temp = temp.nref ; 
    //         }
    //     }
    // }

    // 3 Insert a Node at End of List
    public void InsertatEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head ; 
            while(temp.nref!=null){
                temp = temp.nref ; 
            }temp.nref = newNode; 
            newNode.pref = temp ; 
        }

    }

    

    // Method for Display element of DobulyLinked List 
    public void Traverse(){
        if(head==null){
            System.out.println("Node not exit's...");
            return ; 
        }else{
            Node temp = head ; 
            while(temp!=null){
                System.out.print(temp.data+" <--> ");
                temp = temp.nref ; 
            }System.out.println("null");
        }
    }
    public static void main(String[] args) {
        doublyLinkedlist d = new doublyLinkedlist();
        //insert at begin
        d.InsertBegin(12);
        d.InsertBegin(24);

        //insert at any position
        d.InsertatPos(33, 1);
        d.InsertatPos(433, 2);

        //insert at end
        d.InsertatEnd(100);
        d.InsertatEnd(230);

        // display 
        d.Traverse();

        System.out.println(d.Is_empty()); 
        System.out.println("Length of DoublyLinked list is :- "+d.Length());
    }
}