public class Divisor{
    public static void divisornum(int num){
        for(int i = 1 ; i<=num ; i++){
            if(num%i==0){
                System.out.println("Divisor of "+num+" is = "+i);
            }
        }
    }

    public static void Primenumber(int num){
        if(num==0 || num==1){
            System.out.println(1);
        }
        else{
            for(int i =2 ; i<num-1 ; i++){
                if(num%i==0){
                    System.out.println("Is Not Prime Number");
                    break;
                }else{
                    System.out.println("Is prime Number");
                    break;
                }
            }
        }
    }

    public static void Slievenum(int num){ // sieve number is used to check prime number between a range.
        int counter = 0 ; 
        for(int i = 0 ; i<=num;i++){
            if(i==0||i==1){
                System.out.println(i+" is not prime number");
            }
            else{
                for(int j = 2 ; j<=num ; j++){
                    if(i%j==0){
                        System.out.println(i+" is not prime number");
                        break;
                    }else{
                        System.out.println(i+" is prime number");
                        counter++;
                        break;
                    }
                
                }
            }
        }System.out.println("############################");
        System.out.println("Total "+counter+" prime number.");
    }
    public static void main(String[] args) {
        // divisornum(36);
        // Primenumber(1);
        // Slievenum(100);
    }
}