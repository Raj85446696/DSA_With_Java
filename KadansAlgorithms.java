public class KadansAlgorithms {
    public int maxSum(int[] arr){
        int start = 0 ; 
        int end = 0 ; 
        int s = 0 ; 
        int maxsum = arr[0];
        int currsum = arr[0];
        for(int i = 1 ; i<arr.length; i++){
            if(arr[i]>currsum+arr[i]){
                currsum = arr[i];
                s = i ; 
            }else{
                currsum+=arr[i];
            }

            if(currsum>maxsum){
                maxsum = currsum;
                start = s ; 
                end = i ; 
            }
        }
        
        for(int i = start ; i<=end;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        return maxsum; 
    }
    public static void main(String[] args) {
        KadansAlgorithms k = new KadansAlgorithms(); 
        int[]arr = {2,3,-8,7,-1,2,3};
        System.out.println("Max sum is :- "+k.maxSum(arr));
    }
}
