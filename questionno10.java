class CircularSS{
    private Node head ; 
    private Node tail ; 
    private int length; 

    private class Node{
        int data ; 
        Node nref ; 

        public Node(int data){
            this.data = data ; 
            this.nref = null ; 
        }
    }

    public CircularSS(){
        tail = null ; 
        length = 0 ; 

    }

    public int Length(){
        return length ; 
    }

    public boolean is_empty(){
        return (length==0);
    }

    //Insert Node at Beginning of List
    public void InsertNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail= newNode; 
            tail.nref = head ;
        }else{
            newNode.nref = head ; 
            head = newNode;
            tail.nref = head ; 
        }
    }

    public void InsertatEnd(int data){
        Node newNode = new Node(data);
        if(tail==null){
            tail = newNode; 
            tail.nref = head ; 
        }else{
            tail.nref = newNode; 
            tail = newNode;
        }
    }

    void DeleteFirstNode(){
        if(tail==null){
            return ;
        }else{
            head = head.nref ; 
            tail.nref = head ; 
        }
    }

    public void Traverse(){
        if(tail==null){
            System.out.println("Node not exists");
            return;
        }else{
            Node temp = head ; 
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.nref ; 
                length++;
                if(temp==head){
                    break;
                }
            }System.out.println("head");
        }
    }
    public static void main(String[] args) {
        CircularSS c = new CircularSS();
        c.InsertNode(12);
        c.InsertNode(22);
        c.InsertNode(24);
        c.InsertNode(26);
        c.InsertatEnd(56);
        c.InsertatEnd(99);
        c.DeleteFirstNode();
        c.DeleteFirstNode();
        c.Traverse();
        System.out.println(" ");
        // System.out.println("Length of CLL :- "+c.Length());
        // System.out.println(c.is_empty());

    }
}