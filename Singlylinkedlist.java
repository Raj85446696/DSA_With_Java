// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Main {
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
        } else {
            newNode.nref = head;
            head = newNode;
        }
    }

    Node InsertAfterNode(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        Node current = null;

        if (head == null) {
            return newNode;
        }
        if (head.data > newNode.data) {
            newNode.nref = head;
            head = newNode;
            return head;
        }
        while (temp != null && temp.data < newNode.data) {
            current = temp;
            temp = temp.nref;
        }
        newNode.nref = temp;
        current.nref = newNode;
        return head;
    }

    //Method for Delete a Key
    void DeleteAKey(int data) {
        if (head == null) {
            System.out.println("Node not Found");
        } else {
            Node temp = head;
            while (temp.nref != null) {
                if (temp.nref.data == data) {
                    temp.nref = temp.nref.nref;
                    System.out.println("Node deleted");
                    return;
                }
                temp = temp.nref;
            }
        }
    }


    // Method to detect the loop in.
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


    // Method for Checking First Element of Loop. 
    Node FirstElemLoop(){
            Node fNode = head ; 
            Node sNode = head ;
            
            while(fNode!=null && fNode.nref!=null){
                fNode = fNode.nref.nref ; 
                sNode = sNode.nref; 

                if(sNode==fNode){
                    return getStartNode(sNode); 
                }
            }return null;

    }

    Node getStartNode(Node sNode){
        Node temp = head ;
        while(temp!= sNode){
            temp = temp.nref ; 
            sNode = sNode.nref ;  
        }
        return temp; //starting node of the loop
        
    }


    // Method for Traversing a Node.
    public void Traverse() {
        if (head == null) {
            System.out.println("Your linkedlist is Empty.");
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
        Main s = new Main();
        s.InsertNode(42);
        s.InsertNode(41);
        s.InsertNode(34);
        s.InsertNode(22);
        // s.InsertAfterNode(23);
        // s.InsertAfterNode(10);
        s.Traverse();
        // System.out.println("After deletion");
        // s.DeleteAKey(42);
        // s.Traverse();
        System.out.println(s.checkLoop());
        System.out.println(s.FirstElemLoop());

    }

}