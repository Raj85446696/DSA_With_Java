class MaxHeap{
    int[] heap;
    int n ; 

    public MaxHeap(int capacity){
        heap = new int[capacity+1];
        n  = 0 ; 
    }
    public boolean isEmpty(){
        return n ==0 ; 
    }
    public int size(){
        return n ; 
    }

    public void insert(int x){
        if(n==heap.length-1){
            resize(2*heap.length);
        }n++;
        heap[n] = x ; 
        swim(n);
    }

    private void swim(int k){
        while(k>1 && heap[k/2] <heap[k]){
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2;
        }
    }

    public void resize(int capacity){
        int [] temp = new int[capacity];
        for(int i = 0 ; i<temp.length;i++){
            temp[i] = heap[i];
        }
        heap = temp ; 
    }

    public void Print(){
        for(int i = 1 ; i<=n;i++){
            System.out.print(heap[i]+" ");
        }
    }
    public static void main(String[] args) {
        MaxHeap m = new MaxHeap(4);
        m.insert(5);
        m.insert(3);
        m.insert(2);
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        m.Print();

    }
}