public class digitcounter{

    public static void countdigit(int num){
        int counter = 0 ; 
        if(num==0){
            System.out.println(1
            );
        }else{
        while(num>0){
            num/=10; 
            counter++;
        }
        System.out.println("digit is :- "+counter);
    }
    }
    public static void main(String[] args) {
       countdigit(11110); 
    }
}