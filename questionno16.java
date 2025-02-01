// Make a class Queue and perform certain operation such as enqueue , dequeue , isEmpty , length
class Queue{
    int length ; 
    Node front ; 
    Node rear ; 

    class Node{
        int data ;
        Node nref ; 

        Node(int data){
            this.data = data ; 
            this.nref = null ; 
        }
    }

    public int Length(){
        return length ; 
    }

    public boolean isEmpty(){
        return (length==0) ; 
    }

    public void Enqueue(int data){
        Node newNode = new Node(data);
        if(rear==null){
            front = rear = newNode;
            length++;
        }else{
            rear.nref = newNode ;
            rear = newNode; 
            length++;
        }
    }

    public void Dequeue(){
        if(front==null){
            System.out.println("UnderFLow");
            return; 
        }else{
            front = front.nref ;
            length--; 
        }
    }

    public void Traverse(){
        if(front == null){
            System.out.println("Queue not exits");
        }else{
            while(front!=null){
                System.out.print(front.data+" <-- ");
                front = front.nref ;
                // length++; 
            }
        }
    }




    public static void main(String[] args) {
        Queue q = new Queue();
        // q.Enqueue(12); 
        // q.Enqueue(32); 
        // q.Enqueue(42);
        // q.Dequeue(); 
        q.Traverse();
        System.out.println("");
        System.out.println(q.isEmpty());
        System.out.println("Length of Queue is :- "+q.Length());
    }
}
