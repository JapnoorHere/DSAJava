public class TrappingWater {

    public static int trapplingWater(int height[]) {
        int leftArr[] = new int[height.length];
        int rightArr[] = new int[height.length];
        int n = height.length;
        int waterLevel = 0;
        int trapplingWater = 0;

        leftArr[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftArr[i] = Math.max(leftArr[i - 1], height[i]);
        }

        rightArr[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightArr[i] = Math.max(rightArr[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            waterLevel = Math.min(leftArr[i], rightArr[i]);
            trapplingWater += waterLevel - height[i];
        }

        return trapplingWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 0 };
        System.out.println("Trappling water is " + trapplingWater(height));
    }

}
