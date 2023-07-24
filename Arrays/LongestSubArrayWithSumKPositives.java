public class LongestSubArrayWithSumKPositives {

    public static int findSubArray(int[] arr, int k) {
        int ptr1 = 0;
        int ptr2 = 0;
        int sum = 0;
        int maxLen = -1;
        while (ptr2 < arr.length) {
            sum += arr[ptr2];
            while (sum > k && ptr1 <= ptr2) {
                sum -= arr[ptr1];
                ptr1++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, ptr2 - ptr1 + 1);
                ptr2++;
            }

            ptr2++;
        }
        return maxLen;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 3, 5, 5 };
        // int[] arr={1,1,1,1,1,1,1,2,5,2};
        System.out.println(findSubArray(arr, 8));
    }

}
