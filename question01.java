public class question01 {

    // Remove Even Number From array
    public int[] RemoveEven(int []arr){
        int Evenno = 0 ; 
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                Evenno++; 
            }
        }
        int Evenarr[] = new int[Evenno];
        int idx = 0 ; 
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                Evenarr[idx] = arr[i];
            }
        }return Evenarr ; 

    }

    public static void main(String[] args) {
        question01 q = new question01(); 
        int []arr = {3,2,4,7,10,6,5} ;
        System.out.println(q.RemoveEven(arr).length);

    }
}
