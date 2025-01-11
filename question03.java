public class question03 {

    // Move Zero elements to end of array .
    public void MoveZeroEleEnd(int []array){
        int pos = 0 ;
        int size = array.length ; 
        for(int i = 0 ; i<size;i++){
            if(array[i]!=0 && array[pos]==0){
                int temp = array[i]; 
                array[i] = array[pos]; 
                array[pos] = temp ; 
            }
            if(array[pos]!=0){
                pos++;
            }
        }
        for(int i = 0 ; i<array.length ;i++){
            System.out.print(array[i]+" ");
        }
    }

    // Move zero element to start of array 

    public void MoveZeroEleStart(int []array){
        int pos = 0 ;
        int size = array.length ; 
        // int array[] = {0,1,0,4,12};

        for(int i = 0 ; i<size;i++){
            if(array[i]==0 && array[pos]==0){
                pos++;
            }
            if(array[pos]!=0){
                int temp = array[i]; 
                array[i] = array[pos]; 
                array[pos] = temp ;
            }
        }
        for(int i = 0 ; i<array.length ;i++){
            System.out.print(array[i]+" ");
        }
    }


    // Change size of array at Runtime.
    int [] resize(int [] array,int capacity){
        int temp [] = new int[capacity];
        for(int i = 0 ; i<array.length;i++){
            temp[i] = array[i];
        }  
        return temp;
    }


    // Function to find missing number from array 
    int findMissingNum(int [] num){
        int size = num.length+1 ; 
        int sum = size*(size+1)/2;
        for(int i = 0 ; i<num.length ;i++){
            sum=sum -num[i];
        }
        return sum;
    }

    // check whether string is palindrome or not 

    public boolean CheckPalindrome(String name){
        int start = 0 ; 
        int end = name.length()-1;
        while(start<end){
            if(name.charAt(start)==name.charAt(end)){
                return false;
            }
            start++;
            end--;
        }return true;
    }

    // Bubble sort  
    public int [] Bubblesort(int [] array){
        for(int i = 0 ; i<array.length;i++){
            for(int j = 0 ; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }return array;
    }
    public static void main(String[] args) {
        int array[] = {0,1,0,4,12};
        question03 q = new question03(); 
        // q.MoveZeroEleEnd(array);
        // System.out.println(" ");

        // q.MoveZeroEleStart(array);
        // System.out.println("Size of original array is :- "+array.length);

        // array = q.resize(array, 10);
        // System.out.println("Size of New array is :- "+array.length);

        // int [] num = {1,2,3,5,6,8,7};
        // System.out.println("Missing Number is :- "+q.findMissingNum(num));

        // String name = "accba";
        // System.out.println(q.CheckPalindrome(name));
        
        q.Bubblesort(array);
        for(int i = 0 ; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
