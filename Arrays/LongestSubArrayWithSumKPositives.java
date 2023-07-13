public class LongestSubArrayWithSumKPositives {

    public  static int findSubArray(int[] arr,int k){
        int len=0;
        int maxLen=Integer.MIN_VALUE;
        int ptr1=0;
        int ptr2=0;
        int sum=arr[0];

        while(ptr2<arr.length){
            while(ptr1<=ptr2 && sum>k){
                sum-=arr[ptr1];
                ptr1++;
            }
            if(sum==k){
                len=ptr2-ptr1+1;
                maxLen=Math.max(maxLen, len); 
            }
            ptr2++;
            if(ptr2<arr.length)
                sum+=arr[ptr2];
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,3,5,5};
        // int[] arr={1,1,1,1,1,1,1,2,5,2};
        System.out.println(findSubArray(arr,1));
    }
    
}
