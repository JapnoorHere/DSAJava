public class CheckArrayIsSorted {

    public static boolean checkSOrted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2 };
        System.out.println(checkSOrted(arr));
    }
}
