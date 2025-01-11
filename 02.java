class Day02{

    // Function for creating reverse of an array 
    public void ReverseArray(int []array){
        int start = 0 ; 
        int end = array.length-1 ; 
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp; 
            start++; 
            end-- ; 
        }

        for(int i = 0 ; i<array.length ; i++){
            System.out.print(array[i]+" ");
        }


    }

    // Function for finding minimum number in array.
    int FindMinNum(int [] array){
        int min = array[0]; 
            for(int j =1 ; j<array.length ; j++){
                if(array[j]<min){
                    min = array[j];
            }
        }return min ; 
    } 


    // Function for finding minimum number in array.
    int FindMaxNum(int [] array){
        int max = array[0]; 
            for(int j =1 ; j<array.length ; j++){
                if(array[j]>max){
                    max = array[j];
            }
        }return max ; 
    } 

    // Function for finding minimum number in array.
    int SecMaxNum(int [] array){
        int max = Integer.MIN_VALUE; 
        int secmax = Integer.MIN_VALUE; 
            for(int j =1 ; j<array.length ; j++){
                if(array[j]>max){
                    max = array[j];
            }else if(array[j]>secmax && array[j] != max){
                secmax = array[j];
            }
        }return secmax ; 
    } 


    


    
    public static void main(String[] args) {
        int [] array = {12,34,56,78,90};
        Day02 R = new Day02(); 
        // System.out.print("Reversed array is : ");
        // R.ReverseArray(array);
        // System.out.println("");
        // System.out.println(R.FindMinNum(array));
        // System.out.println(R.FindMaxNum(array));
        System.out.println(R.SecMaxNum(array));
    }
}