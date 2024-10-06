import java.lang.reflect.Array;
import java.util.Arrays;

public class secondlargestarr {
    public static void secondlargestarray(int[] arr){
        Arrays.sort(arr);
        System.out.println("Second largest array = "+arr[arr.length-2]);
    }
    public static void main(String[] args) {
        int [] arr = {23,34,56,78,12,34,56};
        secondlargestarray(arr);
    }
}
