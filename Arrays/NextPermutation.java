public class NextPermutation {

    public static void nextPermutationa(int arr[]) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        int index2 = 0;
        int n = arr.length;
        int i;
        for (i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                index = i - 1;
                break;
            }
        }

        if (i == 0) {
            rev(arr, 0, n - 1);
        } else {

            for (i = n - 1; i > index; i--) {
                if (arr[i] < min && arr[index] < arr[i]) {
                    min=arr[i];
                    index2=i;
                    System.out.println("min" + min);
                }
            }
            System.out.println("inde" + arr[index]);
            System.out.println("min" + min);
            int temp = arr[index];
            arr[index] = arr[index2];
            arr[index2] = temp;
            rev(arr, index + 1, n - 1);
        }
    }

    public static void rev(int arr[], int start, int end) {
        while (start < end) {
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // int arr[] = {2,1,5,4,3,0,0};
        int arr[] = {3,6,4,5,2};
        nextPermutationa(arr);
    }
}
