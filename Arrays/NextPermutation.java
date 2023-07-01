public class NextPermutation {

    public static void nextPermutation(int[] arr) {
        int ptr = 0;
        int min = Integer.MAX_VALUE;
        int minLoc = -1;
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                ptr = i - 1;
                break;
            }
        }
        if (ptr == 0) {
            System.out.println("yes");
            rev(arr, 0, n - 1);
        } else {
            for (int i = ptr + 1; i < n; i++) {
                System.out.println();
                if (arr[i] < min && arr[ptr] < arr[i]) {
                    minLoc = i;
                    min = arr[minLoc];

                }
                int temp = arr[minLoc];
                arr[minLoc] = arr[ptr];
                arr[ptr] = temp;
                rev(arr, ptr + 1, n - 1);
            }
        }

    }

    public static void rev(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // int arr[] = {2,1,5,4,3,0,0};
        // int arr[] = {2,3,1,8,7,4};
        // int arr[] = { 3, 6, 4, 5, 2 };
        int arr[] = { 5, 4, 3, 2, 1 };
        nextPermutation(arr);
        for (int i : arr)
            System.out.println(i);
    }
}
