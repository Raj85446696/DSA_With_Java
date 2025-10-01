class MergeSort {
    public static void merge(int[] arr, int left, int right, int mid) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] first = new int[n1];
        int[] second = new int[n2];

        for (int i = 0; i < n1; i++) {
            first[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            second[j] = arr[mid + 1 + j];
        }

        // Merge two sorted 
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (first[i] <= second[j]) {
                arr[k] = first[i];
                i++;
            } else {
                arr[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = first[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = second[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, end, mid);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 23, 45, 67, 1, 345, 5 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}