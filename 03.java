class SinglyLinkedList{
    Node head ; 

    class Node{
        int data ; 
        Node nref ; 

        public Node(int data){
            this.data = data ; 
            this.nref = null ; 
        }
    }

    public void InsertNodeBegin(int data){
        Node newNode = new Node(data); 
        if (newNode==null){
            head = newNode; 
        }else{
            newNode.nref = head ; 
            head = newNode;
        }

    }

    public void InsertatPosition(int data,int Pos){
        Node newNode = new Node(data);
        if(newNode==null){
            head = newNode;
        }else{
            Node temp = head ; 
            for(int i = 1 ; i<Pos-1 ; i++){
                temp = temp.nref ; 
            }
            Node temp2 = temp.nref ; 
            temp.nref = newNode ; 
            newNode.nref = temp2; 
        }
    }

    public void InsertNodeEnd(int data){
        Node newNode = new Node(data); 
        if (newNode==null){
            head = newNode; 
        }else{
            Node temp = head ; 
            while(temp.nref!=null){
                temp = temp.nref ; 
            }
            temp.nref = newNode ; 
            newNode.nref = null; 
        }

    }


    public void Traverse(){
        Node temp = head ; 
        if(temp==null){
            System.out.println("SinglyLinkedlist not exits");
        }else{
            while(temp!=null){
                System.out.print(temp.data+" --> ");
                temp = temp.nref ; 
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList(); 
        s.InsertNodeBegin(10);
        s.InsertNodeBegin(20);
        s.InsertNodeBegin(30);
        s.InsertNodeBegin(40);
        s.InsertNodeEnd(100);
        s.InsertNodeEnd(900);
        s.InsertatPosition(300, 2);
        s.InsertatPosition(899, 5);
        s.Traverse();
    }
}