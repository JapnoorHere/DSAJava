public class WaveArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 8, 9, 10 };
        waveArray(arr);
    }

    public static void waveArray(int[] arr){
        int ptr1 = 0;
        int ptr2 = 1;
        for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[ptr1];
            arr[ptr1] = arr[ptr2];
            arr[ptr2] = temp;

            ptr1+=2;
            ptr2+=2;

        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
