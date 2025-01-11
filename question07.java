class SLL{
    Node head ; 

    class Node{
        int data ; 
        Node nref ; 


        Node(int data){
            this.data = data ; 
            this.nref = null ; 
        }
    }

    boolean checkLoop(){
        if(head==null){
            System.out.println("Node notexits");
        }else{
            Node fNode = head ; 
            Node sNode = head ;
            
            while(fNode!=null && fNode.nref!=null){
                fNode = fNode.nref.nref ; 
                sNode = sNode.nref; 

                if(sNode==fNode){
                    return true; 
                }
            }

        }
        return false;
    }

    void removeNode(Node sNode){
        Node temp = head ;
        while(sNode.nref!=temp.nref){
            temp = temp.nref ; 
            sNode = sNode.nref ; 
        }
        sNode.nref = null ; 

    }

    void RemoveLoopNode(){
        Node fNode = head ; 
        Node sNode = head ; 
        while(fNode!=null && fNode.nref!=null){
            fNode = fNode.nref.nref ; 
            sNode = sNode.nref ; 

            if(sNode==fNode){
                removeNode(sNode);
                return ;
            }
        }

    }

    void Traverse(){
        if(head==null){
            System.out.println("Linkedlist don't exits");
            return ; 
        }else{
            Node temp = head ; 
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.nref ; 
            }System.out.println("null");
        }
    }

    public void createLoopLL(){
        Node first = new Node(23);
        Node second = new Node(34);
        Node third = new Node(30); 
        Node fourth = new Node(90);
        Node fifth = new Node(99);

        head = first ;
        first.nref = second; 
        second.nref = third ; 
        third.nref = fourth;
        fourth.nref = fifth ; 
        fifth.nref = third ;
    }

    public static void main(String[] args) {
        SLL s  = new SLL(); 
        s.createLoopLL();
        System.out.println(s.checkLoop());
        // s.Traverse();
        
    }
}
