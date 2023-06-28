public class Kadanesss {

    public static long kadaness(int arr[]) {
        long currentSum = 0;
        long maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // currentSum=currentSum+arr[i];
            if (currentSum < 0) {
                currentSum = arr[i];
            } else {
                currentSum += arr[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        long returnValue = maxSum;
        // if(maxSum==0){
        // returnValue=findMaxValue(arr);
        // }
        return returnValue;
    }

    // public static long findMaxValue(int arr[]){
    // long maxValue = Integer.MIN_VALUE;
    // long currentMax;
    // for(int i=0;i<arr.length;i++){
    // currentMax=arr[i];
    // if(currentMax>maxValue){
    // maxValue=currentMax;
    // }
    // }
    // return maxValue;
    // }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3 };
        System.out.println(kadaness(arr));
    }
}