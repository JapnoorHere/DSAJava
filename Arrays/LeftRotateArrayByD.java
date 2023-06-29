public class LeftRotateArrayByD {
    
    public static void roatate(int arr[]){
        int d=3;
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        for(int i : arr)
        System.out.println(i);
    }

    public static void reverse(int arr[], int start, int end){
        while(start<end){
            arr[start]= arr[start] ^ arr[end];
            arr[end]= arr[start] ^ arr[end];
            arr[start]= arr[start] ^ arr[end];
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr={5,1,4,9,8};
        roatate(arr);
    }
}
