public class question06{
    Node head;

    class Node {
        int data;
        Node nref;

        public Node(int data) {
            this.data = data;
            this.nref = null;
        }
    }

    public void InsertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode ; 
        }else{
            newNode.nref = head ; 
            head = newNode;
        }
    }

    public void Reverse(){
        if(head==null){
            System.out.println("node not exits");
        }else{
            Node temp = head ; 
            Node next = null ; 
            Node prev = null ; 
            while(temp!=null){
                next = temp.nref ;
                temp.nref = prev ; 
                prev = temp ; 
                temp = next ; 
            }
            head = prev; 
        }
    }

    public void Traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Singly linked list does not exist");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.nref;
            }
            System.out.println("null");
        }
    }

    public int Length(){
        int len = 0 ; 
            Node temp = head;
            if (head == null) {
                System.out.println("Singly linked list does not exist");
            } else {
                while (temp != null) {
                    temp = temp.nref;
                    len+=1;
                }
            }return len;
        }
    

    void MiddleElemOfNode(){
        if(head==null){
            System.out.println("Node not exits.");
        }else{
            Node temp = head ; 
            int len = Length();
            int mid = len/2 ; 
            if(len%2==0){
                for(int i = 0 ; i<mid-1 ; i++){
                    temp = temp.nref; 
                }
                Node temp2 = temp.nref ;
                System.out.println("The Middle of data is :- ["+temp.data+" , "+temp2.data+"]");
            }else{
                for(int i = 0 ; i<mid ; i++){
                    temp = temp.nref ; 
                }
                System.out.println("The Middle of data is :- ["+temp.data+"]"); 
            }
        }
    }

    void RemoveDuplicate(){
        Node temp = head ; 
       if(head==null){
        return;
       }else{
        while(temp!=null && temp.nref!=null){
            if(temp.data==temp.nref.data){
                temp.nref = temp.nref.nref;
            }else{
                temp = temp.nref; 
            }
        }
       }
    }

    public static void main(String[] args) {
        question06 s = new question06();
        s.InsertNode(45);
        s.InsertNode(145);
        s.InsertNode(145);
        s.InsertNode(245);
        s.InsertNode(245);
        // s.InsertNode(345);
        s.Traverse();
        // System.out.println("After Reverse");
        // s.Reverse();
        // s.Traverse();
        // System.out.println(s.Length());
        // s.MiddleElemOfNode();
        s.RemoveDuplicate();
        s.Traverse();

    }
}
