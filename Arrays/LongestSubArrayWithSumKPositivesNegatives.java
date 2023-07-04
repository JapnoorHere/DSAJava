import java.util.HashMap;

public class LongestSubArrayWithSumKPositivesNegatives {

    public static int findlargest(int[] arr,int k){
        int len=Integer.MIN_VALUE;
        int currentSum=0;
        int end=-1;
        int start=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum == k){
                end = i;
                len = Math.max(len,end+1);
            }
            else if(map.containsKey(currentSum-k)){
                start = map.get(currentSum-k);
                end = i;
                len=Math.max(len, end-start);
            }
            if(!map.containsKey(currentSum))
            map.put(currentSum, i);
        }
        if(len==Integer.MIN_VALUE){
            return 0;
        }
        return len;
    }


    public static void main(String[] args) {
        int[] arr={-13,0,6,15,16,2,15,-12,17,-16,0,-3,19,-3,2,-9,-6};
        System.out.println(findlargest(arr,15));
    }
    
}
