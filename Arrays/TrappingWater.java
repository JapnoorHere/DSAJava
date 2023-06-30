public class TrappingWater {

    public static int trappingWater(int[] arr) {
        int[] leftArr = new int[arr.length];
        int[] rightArr = new int[arr.length];
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int trappingWater;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > leftMax){
                leftMax=arr[i];
            }
            leftArr[i] = leftMax;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > rightMax){
                rightMax=arr[i];
            }
            rightArr[i] = rightMax;
        }

        for (int i = 0; i < arr.length; i++) {
            trappingWater = Math.min(leftArr[i], rightArr[i]) - arr[i];
            sum += trappingWater;
        }
        return sum;
    }

    public static void main(String[] args) {
        int height[] = {10,3,9,7,6,8};
        System.out.println("Trappling water is " + trappingWater(height));
    }

}
