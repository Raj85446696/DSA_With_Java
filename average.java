public class average{
    public static void main(String[] args) {
        int [] arr = {12,23,45,67,89,90};
        int l = arr.length ;
        double sum = 0 ; 
        if(l%2==0){
            for(int i =0 ; i<l ;i++){
                sum+=arr[i];
            }
            System.out.println(sum/l);
        }else{
            for(int i =0 ; i<l ;i++){
                sum+=arr[i];   
        }  
        System.out.println(sum/l);
    }
}
}
