class Array {
    private int length ; 
    private int top ; 
    private int[] arr ; 

    Array(int []arr){
        this.arr = arr ; 
    }

    public int Length(){
        return length; 
    }

    public boolean isEmpty(){
        return length==0 ; 
    }

    public void Push(int data){
        
    }

    public void Traverse(){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
            length++;
        }
    }

    public static void main(String[] args) {
        int [] arr = {13,35,46,67,78};
        Array a = new Array(arr); 
        a.Traverse();
        // System.out.println(a.isEmpty());
        // System.out.println(a.Length());
    }
}
