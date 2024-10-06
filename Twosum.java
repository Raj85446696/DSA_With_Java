public class Twosum{
    public static void main(String[] args) {
        int [] arr = {12,34,56,78,90,34};
        int target = 46;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr.length ;j++){
                if((arr[i]+arr[j])==target){
                    System.out.println(i+" "+j+" ");
                }
                }
        }
    }
}

