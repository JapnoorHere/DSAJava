public class MissingNumber {

   public static int missing(int[] arr){
        int sum=0;
        int missingSum = 0;
        for(int i=0;i<=arr.length+1;i++){
            sum+=i;
            if(i<arr.length)
            missingSum+=arr[i];
        }
        return sum-missingSum;
   }

    public static void main(String[] args) {
        int[] arr={1,4,3,2};
        System.out.println(missing(arr));    
    }   
}
