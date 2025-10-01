public class GoodMorning {
    public static void pattern1(int n){
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n ){
        for(int i = n ; i>=1; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i = 0 ; i<n;i++){
            for(int j =0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }
        }System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Subscribe");
        // pattern1(5);
        // pattern2(5);
        pattern3(5);
    }
}
