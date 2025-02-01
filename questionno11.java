class Stack {

    private Node top ; 
    private int length ; 

    class Node{
        private int data ; 
        private Node nref ; 

        public Node(int data){
            this.data = data; 
            this.nref = null ; 
        }  
    }

    public Stack(){
        top = null;
        length=0;
    }

    public boolean is_Empty(){
        return length==0 ; 
    }

    public int Length(){
        return length; 
    }

    public void Push(int data){
        Node newNode = new Node(data);
        newNode.nref = top ; 
        top = newNode;
        length++;
    }

    public int Pop(){
        int res = top.data; 
        top = top.nref ;
        length--;
        return res ;  
        }
    
    public int Top(){
        return top.data ; 
    }

    public void Traverse(){
        if(top==null){
            System.out.println("STack not exits");
        }else{
            Node temp = top ; 
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.nref;
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(); 
        s.Push(23);
        s.Push(99);
        s.Push(399);
        s.Push(699);
        s.Pop();
        s.Pop();
        s.Traverse();
        System.out.println("Top element of stack is = "+s.Top());
        // System.out.println(s.Length());
        // System.out.println(s.is_Empty());
        
    }
}
