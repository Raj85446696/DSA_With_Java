public class Binarysearchreverse {
    public void binarysearchreverse(int arr[] , int target){
        int ans = -1; 
        int start = 0 ; 
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            }else if(arr[mid]<target){
                end = mid-1;
            }else{
                start = mid+1 ; 
            }
        }

        if(ans==-1){
            System.out.println("Elements not Found.....");
        }else{
            System.out.println("Element found at element ..."+ans);
        }

    }
    public static void main(String[] args) {
        int arr[] = {87,54,36,22,18,1};
        Binarysearchreverse Bsr = new Binarysearchreverse();
        Bsr.binarysearchreverse(arr, 22);
    }
}
