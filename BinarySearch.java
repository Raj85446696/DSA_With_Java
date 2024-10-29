public class BinarySearch {
    public void binarySearch(int []arr,int target){
        int ans = -1;
        int start = 0 ; 
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + (end-start)/2);
            if(arr[mid]==target){
                ans = mid;
                break;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        if(ans==-1){
            System.out.println("element not found");
        }else{
            System.out.println("Found "+target+" at index :- "+ans);
        }
    }
    public static void main(String[] args) {
        BinarySearch Bs = new BinarySearch();
        int [] arr = {2,5,11,13,18,20};
        Bs.binarySearch(arr,5);
    }
}
