class Sample{
    public int returnCount(int[]arr,int left , int right){
        int count = 0 ; 
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>=left && arr[i]<=right){
                count++; 
            }
        }return count; 
    }
    public static void main(String[] args){
        Sample s = new Sample(); 
        int[] arr = {345,604,321,433,704,470,808,718,517,811};
        System.out.println(s.returnCount(arr, 400, 700));
    }
}