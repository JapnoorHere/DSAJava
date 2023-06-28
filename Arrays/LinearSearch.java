public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(linearSearch(arr, 5));
    }

    public static int linearSearch(int arr[], int x) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == arr.length) {
            return -1;
        } else {
            return i;
        }
    }
}
