import java.util.*;  

class StringPair {

    // Function to convert number to words (1–100)
    public static String numberToWords(int num) {
        String[] ones = {"zero","one","two","three","four","five","six","seven","eight","nine",
                         "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
                         "seventeen","eighteen","nineteen"};
        String[] tens = {"", "", "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

        if (num < 20)
            return ones[num];
        else if (num < 100) {
            int t = num / 10, o = num % 10;
            return tens[t] + (o != 0 ? ones[o] : "");
        } else if (num == 100)
            return "hundred"; // special rule for 100 only
        return "";
    }

    // Function to count vowels in a word
    public static int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray())
            if ("aeiou".indexOf(c) != -1)
                count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt(); 
        }

        int D = 0;
        for (int num : nums) {
            String word = numberToWords(num);
            D += countVowels(word);
        }

        int pairCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (nums[i] + nums[j] == D)
                    pairCount++;
            }
        }

        // Step 3: Output result
        if (pairCount > 100)
            System.out.println("greater 100");
        else
            System.out.println(numberToWords(pairCount));

        sc.close();
    }
}
