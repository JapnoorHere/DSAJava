public class TrappingWater {

    public static int trappingWater(int[] arr) {
        int[] leftArr = new int[arr.length];
        int[] rightArr = new int[arr.length];
       
        int trappingWater = 0;
        int trappingWaterMax = Integer.MIN_VALUE;
       int leftMax = Integer.MIN_VALUE;
       int rightMax = Integer.MIN_VALUE;
       
       for(int i=0;i<leftArr.length;i++){
            if(arr[i] > leftMax){
                leftMax = arr[i];
            }
            leftArr[i] = leftMax;
       }
       
       for(int i=rightArr.length-1;i>=0;i--){
            if(arr[i] > rightMax){
                rightMax = arr[i];
            }
            rightArr[i] = rightMax;
       }
       
       
       for(int i=0;i<arr.length;i++){
            int waterLevel = Math.min(leftArr[i], rightArr[i]);
            int height = arr[i];
            trappingWater += waterLevel - height;
            if(trappingWater > trappingWaterMax){
                trappingWaterMax = trappingWater;
            }
       }
        return trappingWaterMax;
    }

    public static void main(String[] args) {
        int height[] = {12,8,8,12};
        System.out.println("Trapping water is " + trappingWater(height));
    }

}
