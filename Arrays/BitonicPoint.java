public class BitonicPoint {
    public static void main(String[] args) {
        int arr[] = { 1, 45, 47, 50, 5 };
        System.out.println(bitonicPoint(arr));
    }

    public static int bitonicPoint(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else {
                break;
            }
        }
        return max;
    }
}
