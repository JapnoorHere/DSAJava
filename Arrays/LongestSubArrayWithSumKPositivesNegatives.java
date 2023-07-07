import java.util.HashMap;

public class LongestSubArrayWithSumKPositivesNegatives {

    public static int findlargest(int[] arr){
        int len=Integer.MIN_VALUE;
        int k=0;
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
        int[] arr={-2,34,98,-34,2,-98};
        System.out.println(findlargest(arr));
    }
    
}
