public class question5 {
    Node head ; 
    class Node{
        int data ;
        Node nref ; 

        Node(int data){
            this.data = data ; 
            this.nref = null;
        }
    }

    // Insert a Node 
    public void InsertaNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode; 
        }else{
            newNode.nref = head ; 
            head = newNode;
        }

    }

    // Method for deleting a Node 

    public void DeleteatBegin(){
        if(head==null){
            System.out.println("Node not exists");
            return;
        }else{
            head = head.nref ; 
        }
    }

    // Delete at anyPoisition

    public void DeleteatPos(int pos){
        if(head==null){
            System.out.println("Node not exists");
            return;
        }
        else{
            if(pos==1){
                DeleteatBegin();
            }else{
                Node temp = head ; 
            for(int i =1 ; i<pos-1 ; i++){
                temp = temp.nref ; 
            }Node temp2 = temp.nref ; 
            temp.nref = temp2.nref ; 
            temp2.nref = null ; 
            }

        }
    }

    // Delete a Node at end 
    public void DeleteatEnd(){
        if(head==null){
            System.out.println("Node not exists");
            return;
        }else{
            Node temp = head ; 
            while(temp.nref.nref!=null){
                temp = temp.nref ; 
            }
            temp.nref = null; 
        }
    }

    // Reverse a node 

    public Node Reverse(){
        Node temp = head ; 
        Node pref = null ; 
        Node nref = null ; 
        while(temp!=null){
            nref = temp.nref ; 
            temp.nref = pref ; 
            pref = temp ; 
            temp = nref ; 
        }
        head = pref ; 
        return pref; 
    }

    // Method for Traversing 
    public void Traverse(){
        Node temp = head ; 
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.nref ; 
        }
        System.out.println("null");
    }

    public boolean SearchKey(int key){
        if(head==null){
            System.out.println("Key not Exits");
        }else{
            int index = 0 ; 
            Node temp = head ; 
            while(temp!=null){
                if(temp.data==key){
                    System.out.println(key+" Found at Index :- "+index);
                    return true ; 
                    
                }
                temp = temp.nref ;
                index+=1 ; 
            }
        }return false; 
    }


    public static void main(String[] args) {
       question5 q = new question5(); 
       q.InsertaNode(12);
       q.InsertaNode(34);
       q.InsertaNode(44);
       q.InsertaNode(64);
    //    q.DeleteatBegin();
    //    q.DeleteatBegin();
    //    q.DeleteatEnd();
    //    q.DeleteatEnd();
    //    q.DeleteatPos(2);
    //    q.DeleteatPos(3);
    // q.DeleteatPos(1);
       q.Traverse();
    //    System.out.println(q.SearchKey(44));

    q.Reverse();
    q.Traverse();

    }
}
